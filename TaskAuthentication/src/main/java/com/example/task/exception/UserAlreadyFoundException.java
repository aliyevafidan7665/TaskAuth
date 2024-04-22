package com.example.task.exception;

public class UserAlreadyFoundException extends RuntimeException {

  public UserAlreadyFoundException(String message) {
    super(message);
  }

}
