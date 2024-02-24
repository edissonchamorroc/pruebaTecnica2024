package com.swaglab.exceptions;

public class ExcepcionGeneral extends AssertionError {

    private static final long serialVersionUID = 1;

    public ExcepcionGeneral(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }
}
