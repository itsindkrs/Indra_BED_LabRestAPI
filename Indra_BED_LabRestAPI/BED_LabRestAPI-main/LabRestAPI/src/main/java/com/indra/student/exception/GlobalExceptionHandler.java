package com.indra.student.exception;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@RestControllerAdvice
@Component
public class GlobalExceptionHandler {
	
	@ExceptionHandler(IllegalArgumentException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public Error handleInvalidStudentId(IllegalArgumentException exception) {
		System.out.println("Invalid student id passed :: " + exception.getMessage());
		
		Error error = ((Object) Error.builder())
		                  .code(100)
		                  .message(exception.getMessage())
		                  .build();
		
		return error;
	}
}

@Getter
@Builder
@AllArgsConstructor
class Error {

	public static Object builder() {
		// TODO Auto-generated method stub
		return null;
	}
}