package com.lc;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author liuchen
 * @date 2020/3/20 -11:55
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundException extends  RuntimeException {
    public NotFoundException() {
    }

    public NotFoundException(String message) {
        super(message);
    }

    public NotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
