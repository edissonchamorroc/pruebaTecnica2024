package com.swaglab.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class CarritoUserinterface  extends PageObject {
    
    public static final Target TXT_NAME_ARTICLE = Target.the("Texto de nombre de articulo").locatedBy("//div[@class='inventory_item_name']");
    public static final Target TXT_DESC_ARTICLE = Target.the("Texto de descripcion de articulo").locatedBy("//div[@class='inventory_item_desc']");
    public static final Target TXT_PRICE_ARTICLE = Target.the("Texto de precio de articulo").locatedBy("//div[@class='inventory_item_price']");
    public static final Target BTN_REMOVE_ARTICLE = Target.the("Boton para remover articulo de carrito de compras").locatedBy("//div[@class='cart_item' and contains(.,'{0}')]//button");
    public static final Target BTN_CHECKOUT = Target.the("Boton para ir a checkout").locatedBy("//a[contains(.,'CHECKOUT')]");
    
}
