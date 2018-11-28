package com.example.demo.exception;

import com.example.demo.ErrorCodes;

public class ValidationException extends Throwable {

  private static final long serialVersionUID = 1L;

  public ValidationException(String message) {
    super(message);
  }

  public ValidationException(String message, Throwable cause) {
    super(message, cause);
  }

  public ValidationException(Throwable cause) {
    super(cause);
  }

}
