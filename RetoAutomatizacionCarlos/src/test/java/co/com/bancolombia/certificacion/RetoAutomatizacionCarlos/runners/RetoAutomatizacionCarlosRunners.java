package co.com.bancolombia.certificacion.RetoAutomatizacionCarlos.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/features/RetoAutomatizacionCarlos.feature",
		glue = "co.com.bancolombia.certificacion.RetoAutomatizacionCarlos.stepdefinitions",
		snippets = SnippetType.CAMELCASE)
public class RetoAutomatizacionCarlosRunners {
	
	

}
