package com.insurance.config;

import java.util.Set;
import java.util.stream.Stream;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.insurance.model.ErrorMessage;

@RestControllerAdvice
public class InsuranceManagementExceptionHandler {

	@ExceptionHandler(InsuranceCustomException.class)
	public ResponseEntity<ErrorMessage> getInsuranceCustomException(InsuranceCustomException exception) {
		ErrorMessage error = new ErrorMessage();
		error.setErrorCode("INVALID_INPUT_DATA");
		error.setErrorMessage(exception.getMessage());
		return new ResponseEntity<ErrorMessage>(error, HttpStatus.BAD_REQUEST);
	}

	/*@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorMessage> getException(Exception exception) {
		ErrorMessage error = new ErrorMessage();
		error.setErrorCode("INVALID_INPUT_DATA");
		error.setErrorMessage(exception.getMessage());
		Exception ex = exception;

		while (ex != null) {
			if (ex instanceof ConstraintViolationException) {
				ConstraintViolationException constraintViolation = (ConstraintViolationException) ex;
				String errorMessage = this.parseConstraintValidation(constraintViolation);
				ErrorMessage errorConstraintViolation = new ErrorMessage();
				errorConstraintViolation.setErrorCode("INVALID_INPUT_DATA");
				errorConstraintViolation.setErrorMessage(exception.getMessage());
				return new ResponseEntity<ErrorMessage>(errorConstraintViolation, HttpStatus.BAD_REQUEST);
			}
		}

		return new ResponseEntity<ErrorMessage>(error, HttpStatus.BAD_REQUEST);
	}

	private String parseConstraintValidation(ConstraintViolationException constraintViolation) {
		Set<ConstraintViolation<?>> cv= constraintViolation.getConstraintViolations();
		StringBuffer buffer = new StringBuffer();
		Stream<ConstraintViolation<?>> cvs =cv.stream();
		cvs.forEach((ccv) -> {
			buffer.append(ccv.getRootBean().getClass().getSimpleName()).append(ccv.getPropertyPath()).append(":").append(ccv.getMessage());
		} );
		return buffer.toString();
	}*/

}
