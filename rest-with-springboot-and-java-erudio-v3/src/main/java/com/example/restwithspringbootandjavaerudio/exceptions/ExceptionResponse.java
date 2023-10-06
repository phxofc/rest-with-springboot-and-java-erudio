package com.example.restwithspringbootandjavaerudio.exceptions;

import java.io.Serializable;
import java.util.Date;

//tratamentos de excecoes personalizados
public class ExceptionResponse implements Serializable {
    

    private static final long Serializable = 1L;

    private Date timestamp;
    private String message;
    private String details;



    public ExceptionResponse(Date timestamp, String message, String details) {
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }



    public static long getSerializable() {
        return Serializable;
    }



    public Date getTimestamp() {
        return timestamp;
    }



    public String getMessage() {
        return message;
    }



    public String getDetails() {
        return details;
    }

    


    
}
