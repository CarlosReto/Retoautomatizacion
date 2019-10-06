package co.com.bancolombia.certificacion.RetoAutomatizacionCarlos.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;

import org.glassfish.grizzly.nio.SelectorHandlerTask;
import org.hamcrest.Matchers;

import co.com.bancolombia.certificacion.RetoAutomatizacionCarlos.questions.TextoLink;
import co.com.bancolombia.certificacion.RetoAutomatizacionCarlos.tasks.PaginaLinio;
import co.com.bancolombia.certificacion.RetoAutomatizacionCarlos.utils.drivers.RetoAutomatizacionCarlosDriver;
import co.com.bancolombia.certificación.RetoAutomatizacionCarlos.userinterfaces.LinioHome;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class RetoAutomatizacionCarlosStepDefinitions {
	
	Actor carlos = Actor.named("Carlos");
	
	@Given("^that Carlos wants to buy an product on linio\\.com\\.pe$")
	public void thatCarlosWantsToBuyAnProductOnLinioComPe()  {
		
	carlos.can(BrowseTheWeb.with(RetoAutomatizacionCarlosDriver.web().enLaPagina("https://www.linio.com.pe")));	
	    
	}


	@When("^he selects a product$")
	public void heSelectsAProduct()  {
		
		carlos.attemptsTo(PaginaLinio.clickseleccionarproductos());
		carlos.attemptsTo(PaginaLinio.clickañadircarrito());
		carlos.attemptsTo(PaginaLinio.clickiralcarrito());
	    
	}

	@Then("^he validates the purchase of the producto$")
	public void heValidatesThePurchaseOfTheProducto(String texto)  {
		
	    carlos.should(seeThat(TextoLink.enPantalla(),is(texto)));
	}


}
