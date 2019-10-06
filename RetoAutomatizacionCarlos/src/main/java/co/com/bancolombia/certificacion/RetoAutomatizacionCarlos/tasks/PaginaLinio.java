package co.com.bancolombia.certificacion.RetoAutomatizacionCarlos.tasks;

import co.com.bancolombia.certificación.RetoAutomatizacionCarlos.userinterfaces.LinioHome;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class PaginaLinio implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(LinioHome.CLICK_SELECCIONARPRODUCTO));
		actor.attemptsTo(Click.on(LinioHome.CLICK_AÑADIRALCARRITO));
		actor.attemptsTo(Click.on(LinioHome.CLICK_IRALCARRITO));

	}
	
	public static PaginaLinio clickseleccionarproductos() {
		return new PaginaLinio();
	}
	
	public static PaginaLinio clickañadircarrito() {
		return new PaginaLinio();
	}
	
	public static PaginaLinio clickiralcarrito() {
		return new PaginaLinio();
	}
}
