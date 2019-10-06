package co.com.bancolombia.certificacion.RetoAutomatizacionCarlos.questions;


import co.com.bancolombia.certificaci�n.RetoAutomatizacionCarlos.userinterfaces.LinioHome;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TextoLink implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(LinioHome.TEXTO_ENCONTRADO).viewedBy(actor).asString();

	}
	public static TextoLink enPantalla() {
		return new TextoLink();
		
		
	}
}
