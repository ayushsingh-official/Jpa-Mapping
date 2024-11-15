package com.project.jpaMapping.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import jakarta.persistence.EntityNotFoundException;

@ControllerAdvice
public class ExceptionController extends ResponseEntityExceptionHandler {

	@ExceptionHandler(EntityNotFoundException.class)
	public ResponseEntity<?> entityNotFound(EntityNotFoundException ex) {

		return new ResponseEntity<String>(ex.getMessage() + "  Not available in DB ", HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(NullPointerException.class)
	public ResponseEntity<?> nullPointerException(NullPointerException ex) {

		return new ResponseEntity<>(ex.getMessage() + " ", HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<?> handleAllException(Exception ex) {
		ex.printStackTrace();
		return new ResponseEntity<String>("exception ", HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@Override
	protected ResponseEntity<Object> handleHttpRequestMethodNotSupported(HttpRequestMethodNotSupportedException ex,
			HttpHeaders headers, HttpStatusCode status, WebRequest request) {
		// TODO Auto-generated method stub
		return new ResponseEntity<>("wrong http request", HttpStatus.NOT_FOUND);
	}

}
