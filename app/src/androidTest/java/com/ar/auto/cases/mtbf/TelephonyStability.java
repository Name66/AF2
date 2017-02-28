package com.ar.auto.cases.mtbf;

import android.support.test.runner.AndroidJUnit4;

import com.ar.auto.common.AutoTestCase;
import com.ar.auto.common.CaseName;

import org.junit.Test;
import org.junit.runner.RunWith;

/**
 *1. The contact list in the phone book shall contain 50 contacts.The same phone number can be
     reused for each contact but the contact name shall be different for all 50 contacts
 *2. The phone book contact list shall be populated before the stability tests are started
 *3. The received call list shall be populated before the stability tests are started
 *4. The made call list shall be populated before the stability tests are started
 *5. The missed call list shall be populated before the stability tests are started

 *Call duration and timing requirements
 *1. The call duration shall be 5 seconds for each call made
 *2. The length of time between calls shall be 5 seconds
 */

@RunWith(AndroidJUnit4.class)
public class TelephonyStability extends AutoTestCase {


    /**
     * 5.1.1.1: Make a 3G voice  call from the phone book
     *
     * Number of Loops:
     * 50 for a 3G device
     * 20 for a 3G/LTE device
     */
    @CaseName("从电话本拨打3G通话")
    @Test
    public void testMake3GCallFromPhoneBook() {

    }

    /**
     * 5.1.1.2: Make a LTE/CSFB voice call from the phone book
     *
     * Number of Loops: 60
     */
    @CaseName("从电话本拨打LTE电话")
    @Test
    public void testMakeLTECallFromPhoneBook() {

    }

    /**
     * 5.1.1.3: Make a 3G voice  call from the call history list
     * <p>
     * Number of Loops:
     * 50 for a 3G device
     * 20 for a 3G/LTE device
     */
    @CaseName("从通话记录中拨打3G电话")
    @Test
    public void testMake3GCallFromCallHistoryList() {

    }

    /**
     * 5.1.1.4: Make a LTE/CSFB voice call from the call history list
     * <p>
     * Number of Loops: 60
     */
    @CaseName("从通话记录中拨打LTE电话")
    @Test
    public void testMakeLTECallFromCallHistoryList() {

    }

    /**
     * 5.1.1.5: Receive a voice  call
     *
     * Number of Loops: 100
     *
     *1. Receive a phone call and terminate the call for each iteration.
     *2. Please reference the Precondition section above
     *3. If a 3G device – device is idled on a 3G network
     *4. If a 3G/LTE device – device is idled on a LTE network.  Allow the device to return to LTE before making another call to the device
     */
    @CaseName("收到一个电话")
    @Test
    public void testReceiveVoiceCall() {

    }

    /**
     * 5.1.1.6: Delete a contact from the phone book
     *
     * Number of Loops: 20
     *
     * 1. Delete 20 of the preloaded contacts
     */
    @CaseName("删除联系人")
    @Test
    public void testDeleteContactFromPhoneBook() {

    }

    /**
     * 5.1.1.7: Add a contact to the phone book
     *
     * Number of Loops: 20
     *
     * 1. Add 20 contacts back into the phone book
     */
    @Test
    @CaseName("添加联系人")
    public void testAddContactToPhoneBook() {

    }



}
