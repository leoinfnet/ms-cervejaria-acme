package com.acme.cerveja.conf;

import info.schnatterer.mobynamesgenerator.MobyNamesGenerator;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class ApplicationCache {
    public String appName;
    @PostConstruct
    public void init() {
        this.appName = MobyNamesGenerator.getRandomName();
    }
}
