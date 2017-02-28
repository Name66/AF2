package com.ar.auto.cases.mtbf;

import com.ar.auto.common.AutoTestCase;
import com.ar.auto.common.CaseName;

import org.junit.Test;

/**
 * 1. The WiFi radio is turned off
 */

public class WifiStability extends AutoTestCase {


    /**
     * 5.1.10.1:Turn the WiFi radio off and on
     *
     * Number of loops: 20
     *
     * 1. Turn the WiFi radio on
     * 2. Leave the radio on for 10s
     * 3. Turn the Wifi radio off
     */
    @CaseName("打开关闭Wi-Fi")
    @Test
    public void testOpenCloseWifi() {

    }

    /**
     * 5.1.10.2: Connect/Disconnect to a WiFi network
     *
     * Number of loops: 20
     *
     * 1. Connect to a Wifi network
     * 2. Stay Connected for 20s
     * 3. Disconnect to the Wifi network
     */
    @CaseName("连接断开Wi-Fi")
    @Test
    public void testConnectDisconnectWifiNetwork() {

    }
}
