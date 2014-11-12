package com.github.rbrugier.services;


import com.github.rbrugier.dao.UserDao;
import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module
public class BackendModule {

    @Provides
    @Singleton MailService getMailService() {
        return new ExternalMailService();
    }

    @Provides
    @Singleton
    public BusinessService getBusinessService(MailService mailService, UserDao userDao) {
        return new BusinessService(mailService, userDao);
    }
}
