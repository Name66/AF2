package com.ar.auto.cases.mtbf;

import com.ar.auto.common.AutoTestCase;
import com.ar.auto.common.CaseName;

import org.junit.Test;

/**
 * 1. This set of tests shall only be run on device that supports running multiple applications at the same time
 * 2. Maximum number of applications shall be running simultaneously
 */

public class MultiTaskingStability extends AutoTestCase {


    /**
     * 5.1.8.1: Make a phone call
     *
     * Number of loops: 1
     *
     * 1. If a VoLTE device then the phone call shall be a VoLTE call
     */
    @CaseName("拨打电话")
    @Test
    public void testMakePhoneCall() {

    }

    /**
     * 5.1.8.2: Switch from the telephony application to each running application
     *
     * Number of loops: 50
     *
     * 1. Increment the counter each time an application switch occurs
     * 2. Shall include, contacts, messaging, telephony, store front, camera, and browser applications as a minimum
     * 3. Each application shall have a soak time of 3 seconds after the application has been selected
     */
    @CaseName("应用切换")
    @Test
    public void testSwitchFromTelephonyToOtherApplication() {

    }

    /**
     * 5.1.8.3: End the phone call
     *
     * Number of loops: 1
     */
    @CaseName("挂断电话")
    @Test
    public void testEndCall() {

    }

    /**
     * 5.1.8.4: Start a browser session and load home page.
     *
     * Number of loops: 1
     */
    @CaseName("打开浏览器并且加载主页面")
    @Test
    public void testOpenBrowserAndLoadHomePage() {

    }

    /**
     * 5.1.8.5: Switch from the browser application to each running application
     *
     * Number of loops: 50
     *
     * 1. Increment the counter each time an application switch occurs
     * 2. Shall include, contacts, messaging, telephony, store front, camera, and browser applications as a minimum
     * 3. Each application shall have a soak time of 3 seconds after the application has been selected
     */
    @CaseName("切换应用程序")
    @Test
    public void testSwitchFromBrowserToOtherApplication() {

    }

    /**
     * 5.1.8.6: Close the browser
     *
     * Number of loops: 1
     */
    @CaseName("关闭浏览器")
    @Test
    public void testCloseBrowser() {

    }


}
