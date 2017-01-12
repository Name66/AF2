package com.ar.auto.cases;

import android.app.Instrumentation;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.uiautomator.By;
import android.support.test.uiautomator.BySelector;
import android.support.test.uiautomator.Configurator;
import android.support.test.uiautomator.Direction;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObject2;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiSelector;
import android.support.test.uiautomator.Until;
import android.util.Log;

import com.ar.auto.common.AutoTestCase;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;

@RunWith(AndroidJUnit4.class)
public class Demo{
    UiDevice mDevice;
    Instrumentation instrumentation;
    @Before
    public void setUp() {
        instrumentation = InstrumentationRegistry.getInstrumentation();
        mDevice = UiDevice.getInstance(instrumentation);
    }

    private void mClickAndWaitForNewWindow(BySelector byselector) {
        final UiObject2 object2 = mDevice.findObject(byselector);
        mDevice.performActionAndWait(new Runnable() {
            @Override
            public void run() {
                object2.click();
            }
        },Until.newWindow(), 20000);
    }

    private void mClickAndWaitForNewWindow(BySelector byselector, long time) {
        final UiObject2 object2 = mDevice.findObject(byselector);
        mDevice.performActionAndWait(new Runnable() {
            @Override
            public void run() {
                object2.click();
            }
        },Until.newWindow(), time);
    }

    @Test
    public void testDemo() {
        this.mClickAndWaitForNewWindow(By.text("Sound"));
    }
}
