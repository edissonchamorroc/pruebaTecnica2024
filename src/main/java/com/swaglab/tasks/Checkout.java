package com.swaglab.tasks;

import java.util.HashMap;
import java.util.Map;

import com.swaglab.enums.Keys;
import com.swaglab.userinterfaces.CheckoutUserinterface;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SendKeys;

public class Checkout implements Task {

    private Map<String, String> dataAsMap = new HashMap<String, String>();

    public Checkout(DataTable dataTable) {

        this.dataAsMap = dataTable.asMap(String.class, String.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SendKeys.of(dataAsMap.get(Keys.NAME.getKey())).into(CheckoutUserinterface.INP_FIRST_NAME),
                SendKeys.of(dataAsMap.get(Keys.LAST.getKey())).into(CheckoutUserinterface.INP_LAST_NAME),
                SendKeys.of(dataAsMap.get(Keys.ZIPCODE.getKey())).into(CheckoutUserinterface.INP_ZIPCODE),
                Scroll.to(CheckoutUserinterface.BTN_CONTINUE),
                Click.on(CheckoutUserinterface.BTN_CONTINUE),
                Scroll.to(CheckoutUserinterface.BTN_FINISH),
                Click.on(CheckoutUserinterface.BTN_FINISH)
        );
    }

    public static Checkout compra(DataTable dataTable) {
        return Tasks.instrumented(Checkout.class, dataTable);
    }
}
