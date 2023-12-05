package com.subhacodes.gradledemo;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.Date;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ExceptionHandler extends ResponseEntityExceptionHandler{
    
    
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException exception, 
            HttpHeaders httpHeaders, HttpStatus httpStatus, WebRequest webRequest){
                Map<String, Object> objectBody = new LinkedHashMap<>();
                objectBody.put("Current TimeStamp", new Date());
                objectBody.put("Status", httpStatus.value());

                List<String> exceptionErrors = exception.getBindingResult().getFieldErrors()
                    .stream().map(x -> x.getDefaultMessage()).collect(Collectors.toList());

                objectBody.put("Errors", exceptionErrors);

                return new ResponseEntity<>(objectBody, httpStatus);
    }
}
