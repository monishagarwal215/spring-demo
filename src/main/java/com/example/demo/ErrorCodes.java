package com.example.demo;

public enum ErrorCodes {

  VALIDATION_ERROR("1001");

  String value;

  ErrorCodes(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}
