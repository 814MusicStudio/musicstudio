package com.musicstudio.manager.impl;

import com.musicstudio.manager.MailManager;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

import java.net.Authenticator;

/**
 * Created by linjay on 15/6/17.
 */
public class MailManagerImpl extends Authenticator implements MailManager {

    @Override
    public void sendMail() throws EmailException {
        Email email = new SimpleEmail();
        email.setHostName("smtp.googlemail.com");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator("username", "password"));
        email.setSSLOnConnect(true);
        email.setFrom("user@gmail.com");//Ä¿±êµØÖ·
        email.setSubject("TestMail");
        email.setMsg("This is a test mail ... :-)");
        email.addTo("foo@bar.com");
        email.send();
    }
}
