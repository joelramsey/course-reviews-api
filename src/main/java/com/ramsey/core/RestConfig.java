package com.ramsey.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.data.rest.core.event.ValidatingRepositoryEventListener;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

import javax.xml.validation.Validator;

@Configurable
public class RestConfig extends RepositoryRestConfigurerAdapter{
    @Autowired
    private Validator validator;

    @Override
    public void configureValidatingRepositoryEventListener(ValidatingRepositoryEventListener validatingListener) {
        super.configureValidatingRepositoryEventListener(validatingListener);
        validatingListener.addValidator("beforeCreate", (org.springframework.validation.Validator) validator);
        validatingListener.addValidator("beforeSave", (org.springframework.validation.Validator) validator);
    }
}
