package com.ar.auto.cases.mtbf;

import com.ar.auto.common.AutoTestCase;
import com.ar.auto.common.CaseName;

import org.junit.Test;

/**
 * 1. All content used in the below tests shall be preloaded on the device before the stability tests are started
 *
 * Email test and timing requirements
 * 1. An Email message shall be verified as sent on the device sending the message before sending another Email message.  The device receiving the Email shall not be used to for this purpose
 * 2. An Email  shall be sent every 15 seconds
 */

public class EmailStability extends AutoTestCase {



    /**
     * 5.1.3.1: Send an email with no attachment
     *
     * Number of loops:
     * 50 for a 3G device
     * 20 3G, 30 LTE for a LTE device
     *
     * 1. The email text shall have 30 characters.  The message shall be preloaded so there is no character by character input
     * 2. The email subject shall have 10 characters
     * 3. Forwarding of the same email is allowed
     * 4. The next email shall be sent as soon as it has been verified on the sending device the email message has been successfully sent
     * 5. Clean up of sent items after each message send is assumed in this test to keep memory use from reaching 100%.
     */
    @CaseName("发送一封不带附件的邮件")
    @Test
    public void testSendMailWithoutAttachment() {

    }

    /**
     * 5.1.3.2: Send an email with an attachment
     * <p>
     * Number of loops:
     * 50 for a 3G device
     * 20 3G, 30 LTE for a LTE device
     * <p>
     * 1. The email text shall have 30 characters
     * 2. The email subject shall have 10 characters
     * 3. The attachment shall be 100kb in size
     * 4. The next email shall be sent as soon as it has been verified on the sending device the email message has been sent
     * 5. Clean up of sent items after each message send is assumed in this test to keep memory use from reaching 100%.
     */
    @CaseName("发送一封带有附件的邮件")
    @Test
    public void testSendMailWithAttachment() {

    }

    /**
     * 5.1.3.3: 打开一封邮件
     * <p>
     * Number of loops: 50
     */
    @CaseName("打开一封邮件")
    @Test
    public void testOpenMail() {

    }
}
