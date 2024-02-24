package com.swaglab.interactions;

import com.swaglab.userinterfaces.CarritoUserinterface;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class Remover implements Task {
    
    private String campo;

    
    public Remover(String campo) {
        this.campo = campo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Scroll.to(CarritoUserinterface.BTN_REMOVE_ARTICLE.of(campo)),
            Click.on(CarritoUserinterface.BTN_REMOVE_ARTICLE.of(campo))
        );
    }

    public static Remover articulo(String campo){
        return Tasks.instrumented(Remover.class,campo);
    }

    
}