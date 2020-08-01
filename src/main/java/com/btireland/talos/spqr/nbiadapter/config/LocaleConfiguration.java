package com.btireland.talos.spqr.nbiadapter.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.Clock;

@Configuration
public class LocaleConfiguration {

    @Bean
    public Clock getDefaultClock(){
        return Clock.systemDefaultZone();
    }
}
