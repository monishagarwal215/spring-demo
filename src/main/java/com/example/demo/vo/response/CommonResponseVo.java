package com.example.demo.vo.response;

public class CommonResponseVo {

  private Boolean status;
  private String message;

  public CommonResponseVo(String message) {
    this.message = message;
    this.status = false;
  }

  public CommonResponseVo() {

  }

  public Boolean getStatus() {
    return status;
  }

  public void setStatus(Boolean status) {
    this.status = status;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public String toString() {
    return "CommonResponseVo{" +
        "status=" + status +
        ", message='" + message + '\'' +
        '}';
  }
}
