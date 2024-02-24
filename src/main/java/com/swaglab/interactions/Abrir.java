package com.swaglab.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.environment.SystemEnvironmentVariables;

public class Abrir implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Open.url(SystemEnvironmentVariables.createEnvironmentVariables().getProperty("url_swaglab"))
        );
    }

    public static Abrir ulr(){
        return Tasks.instrumented(Abrir.class);
    }
    
}
