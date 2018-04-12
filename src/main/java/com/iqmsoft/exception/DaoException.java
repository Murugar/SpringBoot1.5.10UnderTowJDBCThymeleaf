package com.iqmsoft.exception;

import org.springframework.dao.DataAccessException;

public class DaoException extends DataAccessException {
    public DaoException(Throwable cause) {
        super("DAO layer occurs the error", cause);
    }
}
