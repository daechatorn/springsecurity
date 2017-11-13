package org.man.springuiandresource.springresource.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@ComponentScan({"org.man.springuiandresource.springresource.controller"})
public class SecurityConfig extends WebMvcConfigurerAdapter {
    //
}
