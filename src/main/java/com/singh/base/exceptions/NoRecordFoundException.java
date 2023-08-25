package com.singh.base.exceptions;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class NoRecordFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
}
