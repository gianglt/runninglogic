package com.tutorialspoint.runninglogic;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import java.util.logging.Logger;

@Component
public class PostConstructExampleBean {

    // ...

    private static final Logger LOG = Logger.getLogger(PostConstructExampleBean.class.getName());

    @Autowired
    private Environment environment;

    @PostConstruct
    public void init() {
        LOG.info(Arrays.toString(environment.getDefaultProfiles()));
    }
}