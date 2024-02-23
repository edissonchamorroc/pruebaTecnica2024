package com.swaglab.setup;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

import com.swaglab.enums.Actor;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ConfiguracionEscenarios {

    @Before
    public void setUp() {
        setTheStage(new OnlineCast());
        theActorCalled(Actor.NAME.getName());
    }

}
