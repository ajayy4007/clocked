package com.sb.services.model;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.sb.services.user.entity.UserResponse;

@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(value = { BussinessException.class })
	protected ResponseEntity<UserResponse> handleConflict(BussinessException ex, WebRequest request) {
		UserResponse res = new UserResponse();
		res.setStatus("failure");
		res.setError(ex.getError());
		
		return ResponseEntity.ok(res);
	}
}