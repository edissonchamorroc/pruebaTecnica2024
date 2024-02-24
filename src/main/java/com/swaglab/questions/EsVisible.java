package com.swaglab.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class EsVisible implements Question<Boolean>{

    private Target campo;


    public EsVisible(Target campo) {
        this.campo = campo;
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        return the(campo).answeredBy(actor).isVisible();
    }


    public static EsVisible elCampo(Target campo){
        return new EsVisible(campo);
    }
    
}
