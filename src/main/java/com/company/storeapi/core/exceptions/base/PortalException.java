package com.company.storeapi.core.exceptions.base;

import com.company.storeapi.core.exceptions.enums.LogRefServices;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * The type Portal exception.
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class PortalException extends RuntimeException {

    private final LogRefServices logRefServices;
    private final String message;

    /**
     * Instantiates a new Portal exception.
     *
     * @param logRefServices the log ref services
     * @param message        the message
     */
    public PortalException(LogRefServices logRefServices, String message) {
        this.logRefServices = logRefServices;
        this.message = message;
    }

    /**
     * Instantiates a new Portal exception.
     *
     * @param logRefServices the log ref services
     * @param message        the message
     * @param cause          the cause
     */
    public PortalException(LogRefServices logRefServices, String message, Throwable cause){
        super(message,cause);
        this.logRefServices= logRefServices;
        this.message= message;
    }
}
