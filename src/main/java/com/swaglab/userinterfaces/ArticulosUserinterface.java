package com.swaglab.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ArticulosUserinterface {
    

    public static final Target BTN_ADD_ARTICLE = Target.the("Boton para agregar articulo a carrito").locatedBy("//div[@class='inventory_item' and contains(.,'{0}')]//button");
    public static final Target BTN_GO_CART = Target.the("Boton para ir a carrito de compras").locatedBy("//a[@class='shopping_cart_link fa-layers fa-fw']");
}
