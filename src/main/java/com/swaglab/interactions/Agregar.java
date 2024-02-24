package com.swaglab.interactions;

import com.swaglab.userinterfaces.ArticulosUserinterface;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class Agregar implements Task {

    private String article;

    public Agregar(String article) {
        this.article = article;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(ArticulosUserinterface.BTN_ADD_ARTICLE.of(this.article)),
                Click.on(ArticulosUserinterface.BTN_ADD_ARTICLE.of(this.article)));
    }

    public static Agregar articulo(String nombreArticulo) {
        return Tasks.instrumented(Agregar.class, nombreArticulo);
    }

}
