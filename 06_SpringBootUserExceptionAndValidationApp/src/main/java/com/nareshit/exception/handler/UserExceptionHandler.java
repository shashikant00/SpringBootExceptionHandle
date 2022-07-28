package com.nareshit.exception.handler;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.nareshit.exception.UserNotFoundException;

@RestControllerAdvice
public class UserExceptionHandler {
	
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String, String> handleInvalidArgument(MethodArgumentNotValidException ex)
	{
		Map<String,String> errorMap=new HashMap<>();
		ex.getBindingResult().getFieldErrors().forEach(error->{
			errorMap.put(error.getField(),error.getDefaultMessage());
		});
		return errorMap;
	}
	@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(UserNotFoundException.class)
    public Map<String, String> handleBussinessException(UserNotFoundException ex)
    {
    	Map<String,String> errorMap=new HashMap<>();
    	errorMap.put("errorMessage",ex.getMessage());
    	return errorMap;
    }
}
