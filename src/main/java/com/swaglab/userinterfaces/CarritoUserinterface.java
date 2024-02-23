package com.swaglab.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CarritoUserinterface {
    
    public static final Target TXT_NAME_ARTICLE = Target.the("Texto de nombre de articulo").locatedBy("//div[@class='inventory_item_name' and contains(.,'{0}')]");
    public static final Target TXT_DESC_ARTICLE = Target.the("Texto de descripcion de articulo").locatedBy("//div[@class='inventory_item_desc' and contains(.,'{0}')]");
    public static final Target TXT_PRICE_ARTICLE = Target.the("Texto de precio de articulo").locatedBy("//div[@class='inventory_item_price' and contains(.,'{0}')]");
}
