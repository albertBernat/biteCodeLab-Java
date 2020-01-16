package com.ttpsc.bitecodelab.coffee_machine.exception;

import java.sql.SQLException;

public class CoffeeQueryException extends RuntimeException {
    public CoffeeQueryException(String message, Throwable cause) {
        super(message, cause);
    }

    public CoffeeQueryException(SQLException e) {
        super(e);
    }
}
