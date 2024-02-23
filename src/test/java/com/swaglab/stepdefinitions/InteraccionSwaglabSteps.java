package com.swaglab.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

public class InteraccionSwaglabSteps {

    @Dado("Que ingreso a la pagina de swaglab")
    public void QueIngresoALaPaginaDeSwaglab() {

    }

    @Cuando("selecciono articulo {string}")
    public void seleccionoArticulo(String articulo) {

    }

    @Cuando("se seleccionan los articulos")
    public void seSeleccionanLosArticulos(io.cucumber.datatable.DataTable dataTable) {
      
    }

    @Cuando("se remueve el articulo {string}")
    public void seRemueveElArticulo(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
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
