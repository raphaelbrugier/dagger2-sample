package com.github.rbrugier.services;

public class ExternalMailService implements MailService {
    @Override
    public void sendMail() {
        System.out.println("sending the mail");
    }
}
