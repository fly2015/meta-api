/*
 * WebMvcConfig.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package meta.api.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
@Configuration
@EnableWebMvc
public class WebMvcConfig implements WebMvcConfigurer
{
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**");
        /*.allowedOrigins("*")
        .allowedMethods("GET", "POST")
        .allowedHeaders("Origin")
        .exposedHeaders("Access-Control-Allow-Origin")
        .allowCredentials(false).maxAge(3600);*/
    }
}



/*
 * Changes:
 * $Log: $
 */