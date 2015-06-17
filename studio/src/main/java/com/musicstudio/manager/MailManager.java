package com.musicstudio.manager;

import org.apache.commons.mail.EmailException;

/**
 * Created by linjay on 15/6/17.
 */
public interface MailManager {
    void sendMail() throws EmailException;
}
