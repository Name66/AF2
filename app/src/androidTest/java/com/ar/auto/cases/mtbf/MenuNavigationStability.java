package com.ar.auto.cases.mtbf;

import com.ar.auto.common.AutoTestCase;
import com.ar.auto.common.CaseName;

import org.junit.Test;


public class MenuNavigationStability extends AutoTestCase {


    /**
     * 5.1.9.1: Staring from the desktop
     *
     * 1. Navigate to each desktop icon
     * 2. Within each desktop icon navigate through each sub-menu to lowest possible level.  Continue this process until the complete menu tree for the desktop icon has been traversed.
     * 3. When the menu traversal encounters a application the application shall be opened and then closed
     */
    @CaseName("从桌面开始")
    @Test
    public void testStartingFromDesktop() {

    }
}
