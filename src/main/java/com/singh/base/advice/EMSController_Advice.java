package com.singh.base.advice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.UnexpectedTypeException;

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.singh.base.constants.GlobalExceptionConstants;
import com.singh.base.daoImpl.EmployeeDaoImpl;
import com.singh.base.exceptions.NoRecordFoundException;

@RestControllerAdvice
public class EMSController_Advice {
	
	private static final Logger log = Logger.getLogger(EMSController_Advice.class);
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Map<String,String>> handlemethodArgumentNotValidException(MethodArgumentNotValidException methodArgumentNotValidException) {
		Map<String, String> response = new HashMap<>();
		
		methodArgumentNotValidException.getBindingResult().getAllErrors().forEach(error ->{
			String fieldName = ((FieldError)error).getField();
			String errorMessage = error.getDefaultMessage();
			response.put(fieldName, errorMessage);
		});
		
		log.error(response);
		
		return new ResponseEntity<Map<String,String>>(response, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(NoRecordFoundException.class)
	public ResponseEntity<String> handleNoRecordFound(NoRecordFoundException noRecordFoundException) {
		return new ResponseEntity<String>(GlobalExceptionConstants.NO_RECORD_FOUND, HttpStatus.NOT_FOUND);
	}
	

}
