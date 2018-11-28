package com.example.demo.config;

import com.example.demo.controller.LoginController;
import javax.annotation.PostConstruct;
import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
@ApplicationPath("/")
public class JerseyConfig extends ResourceConfig {

  public JerseyConfig() {
    register(LoginController.class);
  }

  @PostConstruct
  public void init() {
  }
}