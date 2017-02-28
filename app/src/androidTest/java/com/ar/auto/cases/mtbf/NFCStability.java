package com.ar.auto.cases.mtbf;

import com.ar.auto.common.AutoTestCase;
import com.ar.auto.common.CaseName;

import org.junit.Test;

/**
 * 1. The WiFi radio is turned off
 */

public class NFCStability extends AutoTestCase {

    /**
     * 5.1.11.1: Turn the NFC radio off and on
     *
     * Number of loops: 20
     *
     * 1. Turn the NFC radio on
     * 2. Leave the radio on for 10s
     * 3. Turn the NFC radio off
     */
    @CaseName("打开关闭NFC")
    @Test
    public void testOpenCloseNFC() {

    }
}
