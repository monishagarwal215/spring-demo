package com.example.demo.service;

import com.example.demo.exception.ValidationException;
import java.util.Iterator;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

public interface CommonService {

  ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
  Validator validator = factory.getValidator();

  default void validate(Object object) throws ValidationException {
    if (object == null) {
      throw new ValidationException("Request cannot be empty");
    }

    Set<ConstraintViolation<Object>> constraintViolations = validator.validate(object);
    Iterator<ConstraintViolation<Object>> iterator = constraintViolations.iterator();

    if (iterator.hasNext()) {
      ConstraintViolation constraintViolation = iterator.next();
      throw new ValidationException(constraintViolation.getMessage());
    }
  }

}