package com.swaglab.enums;

public enum Excepciones {

    NOT_FOUND_NAME_ARTICLE("El actor no puedo encontrar el nombre del articulo por la siguiente causa: "),
    NOT_FOUND_DESC_ARTICLE("El actor no puedo encontrar la descripcion del articulo por la siguiente causa: "),
    NOT_FOUND_PRICE_ARTICLE("El actor no puedo encontrar el precio del articulo por la siguiente causa: "),
    NOT_FOUND_ORDER_TXT("El actor no puedo encontrar la descripcion de orden de compra exitosa por la siguiente causa: "),
    VARIFY_ARTICLE_IN_CAR("El actor tuvo problemas validando que el articulo no se encontraba en el carrito de compras por la siguiente causa: ");
    
    private String message;

    private Excepciones(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    
}
