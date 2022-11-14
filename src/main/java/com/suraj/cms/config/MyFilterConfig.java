package com.suraj.cms.config;

import com.suraj.cms.filter.NewFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyFilterConfig {

    @Bean
    public FilterRegistrationBean<NewFilter> registrationBean(){

        FilterRegistrationBean<NewFilter> registrationBean = new FilterRegistrationBean<>();

        registrationBean.setFilter(new NewFilter());
        registrationBean.addUrlPatterns("/customer/*");

        return registrationBean;

    }

}
