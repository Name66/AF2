package com.ar.auto.cases.mtbf;

import com.ar.auto.common.AutoTestCase;
import com.ar.auto.common.CaseName;

import org.junit.Test;

/**
 * 1. All content used in the below tests shall be preloaded on the device before the stability tests are started
 *
 * SMS and MMS test and timing requirements
 * 1. A SMS/MMS/Email/IM message shall be verified as sent on the device sending the message before sending another SMS/MMS message.  The device receiving the SMS/MMS/Email/IM shall not be used to for this purpose
 * 2. A SMS/MMS shall be sent every 15 seconds
 */

public class MessagingStability extends AutoTestCase {



    /**
     * 5.1.2.1: Send a SMS to the device under test
     *
     * Number of Loops: 10
     *
     * 1. Execute this test only if the AMBS is supported by the device
     * 2. Do not wait for this message to be received by the device before moving to the event or iteration
     */
    @CaseName("发送短信")
    @Test
    public void testSendSMSToDevice() {

    }

    /**
     * 5.1.2.2: Send a MMS with picture attachment to the device under test
     *
     * Number of Loops: 5
     *
     * 1. Execute this test only if the AMBS is supported by the device
     * 2. The text portion of the MMS message shall contain 160 characters.
     * 3. MMS attachment size shall be 1MB or the largest size supported by the device
     * 4. Do not wait for this message to be received by the device before moving to the event or iteration
     */
    @CaseName("发送彩信")
    @Test
    public void testSendMMSToDevice() {

    }

    /**
     * 5.1.2.3: Send an SMS maximum number of characters with out requiring the message to be segmented from the device under test.
     *
     * Number of Loops:
     * 50 for a 3G device
     * 20 3G, 30 LTE for a LTE device
     *
     * 1. This message shall be preloaded into the device and not entered character by character.  It is intended that this message is sent or forwarded for each iteration
     * 2. Clean up of sent items after each message send is assumed in this test to keep memory use from reaching 100%.
     */
    @CaseName("发送最大字符的短信")
    @Test
    public void testSendSMSWithMaxCharToDevice() {

    }

    /**
     * 5.1.2.4: Send a MMS with an audio attachment from the device under test
     *
     * Number of Loops:
     * 50 for a 3G device
     * 20 3G, 30 LTE for a LTE device
     *
     * 1. The text portion of the MMS message shall contain 160 characters.
     * 2. MMS attachment size shall be 1MB or the largest size supported by the device
     * 3. This message shall be preloaded into the device and not entered character by character.  It is intended that this message is sent or forwarded for each iteration
     * 4. Clean up of sent items after each message send is assumed in this test to keep memory use from reaching 100%.
     */
    @CaseName("发送带有Audio文件的彩信")
    @Test
    public void testSendMMSWithAutioToDevice() {

    }

    /**
     * 5.1.2.5:Send a MMS with a video attachment from the device under test
     *
     * Number of Loops:
     * 50 for a 3G device
     * 20 3G, 30 LTE for a LTE device
     *
     * 1. The text portion of the MMS message shall contain 160 characters
     * 2. MMS attachment size shall be 1MB or the largest size supported by the device
     * 3. This message shall be preloaded into the device and not entered character by character.  It is intended that this message is sent or forwarded for each iteration
     * 4. Clean up of sent items after each message send is assumed in this test to keep memory use from reaching 100%.
     */
    @CaseName("发送带有Video文件的彩信")
    @Test
    public void testSendMMSWithVideoToDevice() {

    }

    /**
     * 5.1.2.6: Send a MMS with a picture attachment from the device under test
     *
     * Number of Loops:
     * 50 for a 3G device
     * 20 3G, 30 LTE for a LTE device
     *
     * 1. The text portion of the MMS message shall contain 160 of characters
     * 2. MMS attachment size shall be 1MB or the largest the size supported by the device
     * 3. This message shall be preloaded into the device and not entered character by character.  It is intended that this message is sent or forwarded for each iteration
     * 4. Clean up of sent items after each message send is assumed in this test to keep memory use from reaching 100%.
     */
    @CaseName("发送带有Picture文件的彩信")
    @Test
    public void testSendMMSWithPictureToDevice() {

    }

    /**
     * 5.1.2.7: Open a MMS with a 1MB audio attachment or largest size supported by the device
     *
     * Number of Loops: 50
     *
     * 1. Use the message that was preloaded on the device for this test.  Do not use one of the messages sent to the device.
     */
    @CaseName("打开带有Audio文件的彩信")
    @Test
    public void testOpenMMSWith1MBAudio() {

    }

    /**
     * 5.1.2.8: Open a MMS with 1MB video or largest size supported by the device
     *
     * Number of Loops: 50
     *
     * 1. Use the message that was preloaded on the device for this test.  Do not use one of the messages sent to the device.
     */
    @CaseName("打开带有Video文件的彩信")
    @Test
    public void testOpenMMSWith1MBVideo() {

    }

    /**
     * 5.1.2.9: Open a MMS with a 1MB image or largest size supported by the device
     *
     * Number of Loops: 50
     *
     * 1. Use the message that was preloaded on the device for this test.  Do not use one of the messages sent to the device.
     */
    @CaseName("打开带有Picture文件的彩信")
    @Test
    public void testOpenMMSWith1MBImg() {

    }

    /**
     * 5.1.2.10: Open a SMS
     *
     * Number of Loops: 50
     *
     * 1. Use the message that was preloaded on the device for this test.  Do not use one of the messages sent to the device.
     */
    @CaseName("打开短信")
    @Test
    public void testOpenSMS() {

    }



}
