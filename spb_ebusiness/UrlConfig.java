package com.ch.spb_ebusiness;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class UrlConfig implements WebMvcConfigurer{

    public void addResourceHandlers(ResourceHandlerRegistry registry){
        String path="H:\\JetBrains\\IntelliJ_IDEA\\JavaEE_Proj2022\\SpringBoot_Proj_2022\\spb_eBusiness\\src\\main\\resources\\static\\images\\";
        registry.addResourceHandler("/images/**").addResourceLocations("file:"+path);
    }

}
