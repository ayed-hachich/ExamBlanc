package com.example.espritexam1.exceptions;
import com.example.espritexam1.exceptions.enums.ErrorCodes;

import java.util.List;
public class EntityNotFoundException extends Exception {
    private ErrorCodes errorCodes;
    private List<String> errors;

    public EntityNotFoundException(String message, ErrorCodes errorCodes, List<String> errors) {
        super(message);
        this.errorCodes = errorCodes;
        this.errors = errors;
    }

    public EntityNotFoundException(String message, ErrorCodes errorCodes) {
        super(message);
        this.errorCodes = errorCodes;
    }

    public ErrorCodes getErrorCodes() {
        return this.errorCodes;
    }

    public List<String> getErrors() {
        return this.errors;
    }
}
