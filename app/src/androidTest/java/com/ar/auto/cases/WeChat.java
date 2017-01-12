package com.ar.auto.cases;


import android.support.test.uiautomator.By;
import android.support.test.uiautomator.Direction;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject2;
import android.support.test.uiautomator.Until;

import com.ar.auto.common.AutoTestCase;
import com.ar.auto.common.PkgName;

import org.junit.Test;

public class WeChat extends AutoTestCase {

    @Test
    public void testRefreshFriendsZone(){
        mLaunchAppByPackage(PkgName.WECHAT);
        mWaitAndClick(By.text("发现"));
        mWaitAndClick(By.text("朋友圈"));
        mDevice.wait(Until.hasObject(By.res("com.tencent.mm:id/cex")), 5000);
        mDevice.waitForIdle(10000);
        UiObject2 pic = mDevice.findObject(By.res("com.tencent.mm:id/n1"));
        pic.scroll(Direction.UP, 1f);
    }




}
