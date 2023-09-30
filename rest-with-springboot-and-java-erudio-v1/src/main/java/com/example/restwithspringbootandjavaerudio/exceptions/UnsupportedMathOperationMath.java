package com.example.restwithspringbootandjavaerudio.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsupportedMathOperationMath extends RuntimeException {

    public UnsupportedMathOperationMath(String ex) {
        super(ex);
    }

    private static final long serialVersionUID =1L;
}
