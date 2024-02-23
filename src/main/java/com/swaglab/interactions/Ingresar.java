package com.swaglab.interactions;

import com.swaglab.userinterfaces.ArticulosUserinterface;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class Ingresar implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Scroll.to(ArticulosUserinterface.BTN_GO_CART),
            Click.on(ArticulosUserinterface.BTN_GO_CART)
        );
    }

    public static Ingresar aCarrito(){
        return Tasks.instrumented(Ingresar.class);
    }
    
    
}
