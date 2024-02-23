package com.swaglab.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class Obtener implements Question<String> {

    private Target campo;

    public Obtener(Target campo) {
        this.campo = campo;
    }

    @Override
    public String answeredBy(Actor actor) {
        return actor.asksFor(Text.of(campo)).toString();
    }

    public static Obtener textoDe(Target campo) {
        return new Obtener(campo);
    }
    

}
