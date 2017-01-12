package com.ar.auto.common;

import android.app.Instrumentation;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.provider.Settings;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.uiautomator.By;
import android.support.test.uiautomator.BySelector;
import android.support.test.uiautomator.Configurator;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject2;
import android.support.test.uiautomator.Until;
import android.util.Log;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.assertThat;

@RunWith(AndroidJUnit4.class)
public class AutoTestCase {
    private int WIFI_ON = 3;
    private int WIFI_OFF = 1;
    public static Instrumentation instrumentation;
    private Context mContext;
    private Context mTargetContext;
    public static UiDevice mDevice;
    public static String folderName;
    public static final String TAG = AutoTestCase.class.getSimpleName();
    private WifiManager wm = (WifiManager) InstrumentationRegistry.getContext().getSystemService(Context.WIFI_SERVICE);
    private static final int LAUNCH_TIMEOUT = 5000;
    private BluetoothAdapter bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();

    @Rule
    public final TestName name = new TestName();
    private Bundle params;


    @Before
    public void mSetup() throws NoSuchMethodException {
        instrumentation = InstrumentationRegistry.getInstrumentation();
        mDevice = UiDevice.getInstance(instrumentation);
        this.params = InstrumentationRegistry.getArguments();
        mContext = InstrumentationRegistry.getContext();
        mTargetContext = InstrumentationRegistry.getTargetContext();
        Configurator.getInstance().setWaitForSelectorTimeout(20000L);
        Configurator.getInstance().setActionAcknowledgmentTimeout(2000);
        Log.i(TAG, "=====================case start time is :" + getCurrentTime2() + "=====================");
        Method localMethod = getClass().getDeclaredMethod(this.name.getMethodName());
        if (localMethod.isAnnotationPresent(CaseName.class)) {
            sSendStatus(16, "title", localMethod.getAnnotation(CaseName.class).value());
        }
        //folderName = getStrParams("caseFolder");

    }

    @After
    public void mTearDown() {
        this.unregisterCommonWatcher();
        //mBackToHome();
        Log.i(TAG, "==========Case end time is: " + getCurrentTime2() + " ==========");
    }

    public boolean mBackToHome() {
        pressBackKey();
        pressBackKey();
        pressBackKey();
        pressHomeKey();
        return mDevice.getLauncherPackageName().equals(PkgName.LAUNCHER);
    }

    public void mSleep(int paramInt) {
        SystemClock.sleep(paramInt);
    }

    public static void sScreenShot() {
        String str1 = System.currentTimeMillis() + ".png";
        String str2 = "screencap /sdcard" + File.separator + "Auto" + File.separator + folderName + File.separator + str1;
        new Bundle().putString("screencap", str1);
        sSendStatus(17, "screencap", str1);
        shellCommand(str2);
    }

    public String mGetParams(String paramString) {
        return this.params.getString(paramString);
    }

    public static void sSendStatus(int paramInt, String paramString1, String paramString2) {
        Bundle localBundle = new Bundle();
        localBundle.putString(paramString1, paramString2);
        instrumentation.sendStatus(paramInt, localBundle);
    }

    public void addStep(String paramString) {
        new Bundle().putString("casestep", paramString);
        sSendStatus(15, "caseStep", paramString);
    }

    private void registerCommonWatcher() {
        mDevice.registerWatcher("anrWatcher", AndroidWatcher.anrWatcher);
        mDevice.registerWatcher("fcWatcher", AndroidWatcher.fcWatcher);
    }

    private void unregisterCommonWatcher() {
        mDevice.removeWatcher("anrWatcher");
        mDevice.removeWatcher("fcWatcher");
    }

    public void verify(String paramString, boolean paramBoolean) {
        if (paramString.equals("")) {
            verify(paramBoolean);
        } else if (!paramBoolean) {
            sScreenShot();
            Assert.fail(paramString);
        }
    }

    public void verify(boolean paramBoolean) {
        if (!paramBoolean) {
            sScreenShot();
            Assert.fail();
        }
    }

    public void pressBackKey() {
        mDevice.pressBack();
    }

    public void pressHomeKey() {
        mDevice.pressHome();
    }

    public void pressRecentKey() throws RemoteException {
        mDevice.pressRecentApps();
    }

    public void doubleClickBack() {
        long timeout = Configurator.getInstance()
                .getActionAcknowledgmentTimeout();
        Configurator.getInstance().setActionAcknowledgmentTimeout(0);
        for (int i = 1; i <= 2; i++) {
            pressBackKey();
        }
        Configurator.getInstance().setActionAcknowledgmentTimeout(timeout);
    }

    public static String getCurrentTime() {
        Calendar ca = Calendar.getInstance();
        int year = ca.get(Calendar.YEAR);
        int month = ca.get(Calendar.MONTH);
        int day = ca.get(Calendar.DAY_OF_MONTH);
        int minute = ca.get(Calendar.MINUTE);
        int hour = ca.get(Calendar.HOUR);
        int second = ca.get(Calendar.SECOND);
        return year + "-" + (month + 1) + "-" + day + "-" + hour + "-" + minute + "-" + second;
    }

    public static String getCurrentTime2() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
        return sdf.format(new Date());
    }

    public String getRandomNumberString(int count) {
        String randomSequence = "";
        for (int i = 0; i < count; i++) {
            Integer number = new Random().nextInt(10);
            number.toString();
            randomSequence += number.toString();
        }
        return randomSequence;
    }

    public String getRandomCharString(int count) {
        char[] alphaArray = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
                'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
                'w', 'x', 'y', 'z' };
        String randomSequence = "";
        for (int i = 0; i < count; i++) {
            Character c = alphaArray[new Random().nextInt(alphaArray.length)];
            randomSequence += c.toString();
        }
        return randomSequence;
    }

    public static String shellCommand(String shellString) {
        try {
            return mDevice.executeShellCommand(shellString);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Deprecated
    public void execApp(String component, String action) {
        String cmd = "am start -a " + action + " -n" + component;
        try {
            Process process;
            process = Runtime.getRuntime().exec(cmd);
            try {
                process.waitFor();
            } catch (Exception e) {
                e.printStackTrace();
                // TODO: handle exception
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Deprecated
    public void execApp(String component, String action, ArrayList<String> parameters) {
        String cmd = "am start ";
        StringBuilder cmdBuilder = new StringBuilder();
        cmdBuilder.append(cmd);
        if ((action == null) || (!action.isEmpty())) {
            cmdBuilder.append(" -a " + action);
        }
        if (!component.isEmpty())
            cmdBuilder.append(" -n " + component);
        for (String str : parameters)
            cmdBuilder.append(" " + str);
        sSendStatus(-1, "err:", "cmd:" + cmdBuilder.toString());
        try {
            Process process;
            process = Runtime.getRuntime().exec(cmdBuilder.toString());
            try {
                process.waitFor();
            } catch (Exception e) {
                e.printStackTrace();
                // TODO: handle exception
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void mLogClear() {
        String cmd = "logcat -c ";
        try {
            Process process;
            process = Runtime.getRuntime().exec(cmd);
            process.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
            // TODO: handle exception
        }
    }

    private int getWifiState() {
        return wm.getWifiState();
    }

    public boolean mEnableWifi() {
        if (this.getWifiState() == WIFI_OFF) {
            wm.setWifiEnabled(true);
            mSleep(5000);
        }
        return this.getWifiState() == WIFI_ON;
    }

    public boolean mDisableWifi() {
        if (this.getWifiState() == WIFI_ON) {
            wm.setWifiEnabled(false);
            mSleep(5000);
        }
        return this.getWifiState() == WIFI_OFF;
    }

    public void mLaunchAppByPackage(String packageName) {
        // Wait for launcher
        final String launcherPackage = mDevice.getLauncherPackageName();
        assertThat(launcherPackage, notNullValue());
        mDevice.wait(Until.hasObject(By.pkg(launcherPackage).depth(0)),
                LAUNCH_TIMEOUT);
        // Launch the app
        Context context = InstrumentationRegistry.getContext();
        final Intent intent = context.getPackageManager()
                .getLaunchIntentForPackage(packageName);
        // Clear out any previous instances
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        context.startActivity(intent);
        // Wait for the app to appear
        mDevice.wait(Until.hasObject(By.pkg(packageName).depth(0)),
                LAUNCH_TIMEOUT);
    }

    public boolean mEnableBT() {
        return bluetoothAdapter != null && bluetoothAdapter.enable();
    }

    public boolean mDisableBT() {
        return bluetoothAdapter != null && bluetoothAdapter.disable();
    }

    public int mGetScreenBrightnessMode() throws Settings.SettingNotFoundException {
        return Settings.System.getInt(mContext.getContentResolver(), Settings.System.SCREEN_BRIGHTNESS);
    }

    public void mWaitAndClick(BySelector selector) {
        UiObject2 mObject = mDevice.wait(Until.findObject(selector), 5000);
        mObject.click();
    }

    public void mClickAndWaitForNewWindow(BySelector byselector) {
        final UiObject2 object2 = mDevice.findObject(byselector);
        mDevice.performActionAndWait(new Runnable() {
            @Override
            public void run() {
                object2.click();
            }
        },Until.newWindow(), 20000);
    }

    public void mClickAndWaitForNewWindow(BySelector byselector, long time) {
        final UiObject2 object2 = mDevice.findObject(byselector);
        mDevice.performActionAndWait(new Runnable() {
            @Override
            public void run() {
                object2.click();
            }
        }, Until.newWindow(), time);
    }

}
