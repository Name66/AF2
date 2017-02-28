package com.ar.auto.cases.mtbf;

import com.ar.auto.common.AutoTestCase;
import com.ar.auto.common.CaseName;

import org.junit.Test;



public class AppStoreAndDownloadStability extends AutoTestCase {

    /**
     * 5.1.5.1: Open/Close the Store Front Client
     *
     * Number of loops: 20
     *
     * 1. Open and close the Store Front client the required number of iterations
     */
    @CaseName("打开关闭Appstore")
    @Test
    public void testOpenCloseAppStore() {

    }

    /**
     * 5.1.5.2: Download a Java application/game
     *
     * Number of loops:
     * 10 3G for a 3G device
     * 4 3G, 6 LTE for a LTE device
     */
    @CaseName("下载应用或者游戏")
    @Test
    public void testDownloadAppOrGame() {

    }

    /**
     * 5.1.5.3: Storefront Application download
     *
     * Number of loops:
     * 10 3G for a 3G device
     * 4 3G, 6 LTE for a LTE device
     *
     * 1. Download a free Native application from the storefront supported on the device
     */
    @CaseName("下载应用")
    @Test
    public void testDownloadApplication() {

    }

    /**
     * 5.1.5.4: Close the application store front
     *
     * Number of loops: 1
     */
    @CaseName("关闭应用商店")
    @Test
    public void testCloseAppStore() {

    }

    /**
     * 5.1.5.5: Open a downloaded Java Game and then close a Java Game
     *
     * Number of loops: 10
     *
     * 1. If the device supports Java and a native execution environment then execute this step 10 times
     * 2. If the device does not support a native execution environment then execute this step 20 times
     */
    @CaseName("打开下载的游戏并关闭游戏")
    @Test
    public void testOpenAndCloseGame() {

    }

    /**
     * 5.1.5.6: Open a downloaded application from the storefront
     *
     * Number of loops: 10
     *
     * 1. If the device support Java and a native execution environment then execute this step 10 times
     * 2. If the device does not support a native execution environment then execute this step 20 times
     */
    @CaseName("打开下载的应用并关闭应用")
    @Test
    public void testOpenCloseApplication() {

    }

    /**
     * 5.1.5.7: Delete a downloaded Java game
     *
     * Number of loops:
     *
     * Delete all Java applications/games downloaded previously in this section
     */
    @CaseName("删除下载的游戏")
    @Test
    public void testUninstallAllDownloadedGame() {

    }

    /**
     * 5.1.5.8: Delete a downloaded Native application
     *
     * Number of loops:
     *
     * Delete all native applications downloaded previously in this section
     */
    @CaseName("删除下载的应用程序")
    @Test
    public void testUninstallAllDownloadedApplication() {

    }


}
