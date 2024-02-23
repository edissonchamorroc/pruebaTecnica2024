package com.swaglab.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

import com.swaglab.interactions.Abrir;
import com.swaglab.interactions.Agregar;
import com.swaglab.interactions.Ingresar;
import com.swaglab.questions.Obtener;
import com.swaglab.tasks.Login;
import com.swaglab.userinterfaces.CarritoUserinterface;

public class InteraccionSwaglabSteps {

    @Dado("Que ingreso a la pagina de swaglab")
    public void QueIngresoALaPaginaDeSwaglab() {
        theActorInTheSpotlight().attemptsTo(
                Abrir.ulr());
    }

    @Dado("realizo login con usuario {string} and contrasena {string}")
    public void realizoLoginConUsuarioAndContrasena(String user, String password) {
        theActorInTheSpotlight().attemptsTo(
                Login.conCredenciales(user, password));
    }

    @Cuando("selecciono articulo {string}")
    public void seleccionoArticulo(String articulo) {
        theActorInTheSpotlight().attemptsTo(
                Agregar.articulo(articulo),
                Ingresar.aCarrito());
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
    public void validaElNombreArticuloSuDescripcionYSuPrecio(String nombreArticulo, String descripcion, String precio) {
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(Obtener.textoDe(CarritoUserinterface.TXT_NAME_ARTICLE.of(nombreArticulo)), equalTo(nombreArticulo)),
                GivenWhenThen.seeThat(Obtener.textoDe(CarritoUserinterface.TXT_NAME_ARTICLE.of(descripcion)), equalTo(descripcion)),
                GivenWhenThen.seeThat(Obtener.textoDe(CarritoUserinterface.TXT_NAME_ARTICLE.of(precio)), equalTo(precio)));
    }

    @Entonces("valida el articulo {string} no se encuentre en el carrito de compras")
    public void validaElArticuloNoSeEncuentreEnElCarritoDeCompras(String string) {

    }

    @Entonces("valida el {string} de orden de compra exitoso")
    public void validaElDeOrdenDeCompraExitoso(String string) {

    }
}
