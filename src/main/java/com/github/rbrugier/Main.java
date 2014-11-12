package com.github.rbrugier;

import com.github.rbrugier.services.BusinessService;

public class Main {

    public static void main(String[] args) {
        ApplicationComponent app = Dagger_ApplicationComponent.builder().build();
        BusinessService businessService = app.getBusinessService();
        businessService.doComplexProcess();
    }
}
