package com.github.rbrugier.services;

import com.github.rbrugier.dao.UserDao;

import javax.inject.Inject;

public class BusinessService {

    private final MailService mailService;
    private final UserDao userDao;

    @Inject
    public BusinessService(MailService mailService, UserDao userDao) {
        this.mailService = mailService;
        this.userDao = userDao;
    }


    /**
     * Execute a complex business process and send out mail notifications
     */
    public void doComplexProcess() {
        userDao.saveUser("me");
        mailService.sendMail();
    }
}
