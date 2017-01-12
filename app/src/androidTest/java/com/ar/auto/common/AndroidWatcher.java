package com.ar.auto.common;


import android.os.SystemClock;
import android.support.test.uiautomator.By;
import android.support.test.uiautomator.UiObject2;
import android.support.test.uiautomator.UiWatcher;
import android.support.test.uiautomator.Until;

import org.junit.Assert;

import static com.ar.auto.common.AutoTestCase.mDevice;

public class AndroidWatcher {
    private static final String TAG = AndroidWatcher.class.getSimpleName();
    //private static final UiDevice iDevice = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
    public static final UiWatcher anrWatcher = new UiWatcher() {
        public boolean checkForCondition() {
            UiObject2 anrWindows = mDevice.findObject(By.clazz("android.widget.TextView").textContains("无响应"));
            if(anrWindows != null) {
                //AutoTestCase.screenShot();
                try {
                    UiObject2 ok = mDevice.findObject(By.clazz("android.widget.Button").text("确定"));
                    if(ok != null) {
                        ok.clickAndWait(Until.newWindow(), 2000L);
                    }
                    SystemClock.sleep(500L);
                    //UiObject2 feedback = CommonWatcher.iDevice.findObject(By.text("在线反馈"));
                    //if(feedback != null) {
                    //   CommonWatcher.iDevice.pressHome();
                    //}
                } finally {
                    AutoTestCase.sSendStatus(10, "ANR", "Detected ANR when running case");
                    //AutoTestCase.callShell("mv /data/anr /sdcard" + File.separator + "MTBF" + File.separator + "anr");
                    Assert.fail("ANR occurred");
                }
                return true;
            } else {
                return false;
            }
        }
    };

    public static final UiWatcher fcWatcher = new UiWatcher() {
        public boolean checkForCondition() {
            UiObject2 fcWindows = mDevice.findObject(By.textContains("已停止运行"));
            if(fcWindows != null) {
                //AutoTestCase.screenShot();
                try {
                    UiObject2 cancel = mDevice.findObject(By.text("确定"));
                    if(cancel != null) {
                        cancel.clickAndWait(Until.newWindow(), 2000L);
                    }
                } finally {
                    AutoTestCase.sSendStatus(11, "FC", "Detected FC when running case");
                    Assert.fail("FC occurred, the case is stoped!");
                }
                return true;
            } else {
                return false;
            }
        }
    };

}
