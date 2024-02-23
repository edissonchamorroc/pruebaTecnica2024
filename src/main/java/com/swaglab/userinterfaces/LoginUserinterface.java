package com.swaglab.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class LoginUserinterface extends PageObject{
    

    public static final Target INP_USER=Target.the("Input para ingresar usuario").locatedBy("//input[@id='user-name']");
    public static final Target INP_PASSWORD=Target.the("Input para ingresar password").locatedBy("//input[@id='password']");
    public static final Target BTN_LOGIN= Target.the("Boton para realizar login").locatedBy("//input[@type='submit']");

 
}
