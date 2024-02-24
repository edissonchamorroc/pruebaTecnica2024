package com.swaglab.tasks;

import java.util.HashMap;
import java.util.Map;

import com.swaglab.interactions.Agregar;
import com.swaglab.userinterfaces.ArticulosUserinterface;
import com.swaglab.userinterfaces.CarritoUserinterface;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class Seleccion implements Task {

    private Map<String, String> dataAsMap = new HashMap<String, String>();

    public Seleccion(DataTable dataTable) {

        this.dataAsMap = dataTable.asMap(String.class, String.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        
        dataAsMap.forEach((k, v) -> actor.attemptsTo(
                Agregar.articulo(v)));

        actor.attemptsTo(
            Scroll.to(ArticulosUserinterface.BTN_GO_CART),
            Click.on(ArticulosUserinterface.BTN_GO_CART),
            Scroll.to(CarritoUserinterface.BTN_CHECKOUT),
            Click.on(CarritoUserinterface.BTN_CHECKOUT)
        );
    }

    public static Seleccion articulos(DataTable dataTable) {
        return Tasks.instrumented(Seleccion.class, dataTable);
    }
}
