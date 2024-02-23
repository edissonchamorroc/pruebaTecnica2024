package com.swaglab.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import com.swaglab.interactions.Abrir;
public class InteraccionSwaglabSteps {

    @Dado("Que ingreso a la pagina de swaglab")
    public void QueIngresoALaPaginaDeSwaglab() {
        theActorInTheSpotlight().attemptsTo(
            Abrir.ulr()
        );
    }

    @Cuando("selecciono articulo {string}")
    public void seleccionoArticulo(String articulo) {

    }

    @Cuando("se remueve el articulo {string}")
    public void seRemueveElArticulo(String string) {
        
    }

    @Cuando("se seleccionan los articulos")
    public void seSeleccionanLosArticulos(io.cucumber.datatable.DataTable dataTable) {

    }

    @Cuando("realiza el proceso de checkout")
    public void realizaElProcesoDeCheckout(io.cucumber.datatable.DataTable dataTable) {

    }

    @Entonces("valida el nombre articulo {string} su descripcion {string} y su precio {string}")
    public void validaElNombreArticuloSuDescripcionYSuPrecio(String string, String string2, String string3) {

    }

    @Entonces("valida el articulo {string} no se encuentre en el carrito de compras")
    public void validaElArticuloNoSeEncuentreEnElCarritoDeCompras(String string) {

    }

    @Entonces("valida el {string} de orden de compra exitoso")
    public void validaElDeOrdenDeCompraExitoso(String string) {

    }
}
