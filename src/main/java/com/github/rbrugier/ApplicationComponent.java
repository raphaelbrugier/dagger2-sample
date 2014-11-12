package com.github.rbrugier;


import com.github.rbrugier.services.BackendModule;
import com.github.rbrugier.services.BusinessService;
import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = {BackendModule.class})
public interface ApplicationComponent {
    BusinessService getBusinessService();
}
