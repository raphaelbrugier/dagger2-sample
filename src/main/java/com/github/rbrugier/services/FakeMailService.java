package com.github.rbrugier.services;

/**
 * A Fake mail to service to avoid sending mail in a non production environment.
 */
public class FakeMailService implements MailService {

    @Override
    public void sendMail() {
        System.out.println("faking the sent of the mail");
    }
}
