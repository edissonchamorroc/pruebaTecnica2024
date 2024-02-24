package com.swaglab.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class CheckoutUserinterface  extends PageObject {

    public static final Target INP_FIRST_NAME = Target.the("Input para ingresar el primer nombre").locatedBy("//*[@id='first-name']");
    public static final Target INP_LAST_NAME = Target.the("Input para ingresar el apellido").locatedBy("//*[@id='last-name']");
    public static final Target INP_ZIPCODE = Target.the("Input para ingresar el codigo postal").locatedBy("//*[@id='postal-code']");
    public static final Target BTN_CONTINUE = Target.the("Botón para continuar con el checkout").locatedBy("//*[@value='CONTINUE']");
    public static final Target BTN_FINISH = Target.the("Botón para finalizar la compra").locatedBy("//a[contains(.,'FINISH')]");
    public static final Target TXT_SUCCESSFULL_ORDER = Target.the("Texto que indica compra exitosa").locatedBy("//div[@class='complete-text']");
    
}
