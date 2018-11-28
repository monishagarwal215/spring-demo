package com.example.demo.vo.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class LoginRequestVo {

  @JsonProperty("un")
  @NotEmpty(message = "Username should be blank or null.")
  @NotNull(message = "Username should be blank or null.")
  private String username;

  @JsonProperty("pass")
  @NotEmpty(message = "Password should be blank or null.")
  @NotNull(message = "Password should be blank or null.")
  private String password;

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public String toString() {
    return "LoginRequestVo{" +
        "username='" + username + '\'' +
        ", password='" + password + '\'' +
        '}';
  }
}
