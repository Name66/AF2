package com.ar.auto.cases.mtbf;

import com.ar.auto.common.AutoTestCase;
import com.ar.auto.common.CaseName;

import org.junit.Test;

/**
 * 1. The AT&T Home page shall be booked marked and preloaded on the device before starting stability tests.  The home page link shall not be entered character by character.
 * 2. The link to start the “Navigation to a link” test shall be booked marked and preloaded on the device before starting stability tests.  The Navigation link shall not be entered character by character.
 * 3. The links for the below content shall be booked marked and preloaded on the device before starting stability tests.  The content links shall not be entered character by character.
 */

public class BrowserStability extends AutoTestCase {

    /**
     * 5.1.4.1: Open the native browser and go to the AT&T home page
     * <p>
     * Number of loops:
     * 50 for a 3G device
     * 20 3G, 30 LTE for a LTE device
     * <p>
     * 1. The browser shall be closed after each time the home page is loaded
     * 2. All the page elements must be successfully rendered
     * 3. The browser cache shall be cleared each iteration
     */
    @CaseName("打开Browser以及打开AT&T的主页")
    @Test
    public void testOpenBrowserAndGotoHomePage() {

    }

    /**
     * 5.1.4.2: Navigate to a link and click on the link
     *
     * Number of loops:
     * 50 for a 3G device
     * 20 3G, 30 LTE for a LTE device
     *
     * 1. Open the browser and then navigate link to link for the required number of iterations
     */
    @CaseName("打开网页上的一个链接")
    @Test
    public void testNavigateLinkAndClick() {

    }

    /**
     * 5.1.4.3: Top Web Sites
     *
     * Number of loops:
     * 10 3G for a 3G device
     * 4 3G, 6 LTE for a LTE device
     *
     * 1. If the Sesame client is loaded do not perform this test
     * 2. Load each of the following web pages. Each of the pages shall completely render before moving to the next page
     * a. www.ebay.com
     * b. www.yahoo.com
     * c. www.amazon.com
     * d. www.youtube.com
     * e. www.nytimescom
     * 3. One loop = loading above web pages a-e.
     */
    @CaseName("访问Top网站")
    @Test
    public void testTopWebSites() {

    }


}
