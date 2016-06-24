package com.rgaete.scrumday.katapotter;

import com.rgaete.scrumday.katapotter.domain.Canasta;
import com.rgaete.scrumday.katapotter.domain.Libro;
import com.rgaete.scrumday.katapotter.services.PriceCalculator;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertNotNull;

public class CalculadorDePreciosStepdefs {

    private Canasta canasta= new Canasta();

    @When("^yo compro (\\d+) copia de \"([^\"]*)\"$")
    public void yo_compro_copia_de(int cantidad, String titulo) throws Throwable {
        Libro libro = new Libro();
        libro.setCantidad(cantidad);
        libro.setTitulo(titulo);
        canasta.getLibros().add(libro);
        assertNotNull(titulo);
    }

    @Then("^el total es (\\d+)$")
    public void el_total_es_$(int total) throws Throwable {
        assertThat(PriceCalculator.calculate(canasta),is(total));
    }
}