package com.example.task.exception;

import static lombok.AccessLevel.PRIVATE;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@AllArgsConstructor
@FieldDefaults(level = PRIVATE, makeFinal = true)
public enum ErrorMessage {

  CLIENT_ERROR("Exception from client"),
  UNEXPECTED_ERROR("Unexpected error occurred");

  String message;

}
