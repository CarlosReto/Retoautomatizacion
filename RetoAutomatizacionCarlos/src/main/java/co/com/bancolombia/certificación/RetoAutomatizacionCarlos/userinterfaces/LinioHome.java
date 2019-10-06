package co.com.bancolombia.certificación.RetoAutomatizacionCarlos.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LinioHome {
	
	public static final Target  CLICK_SELECCIONARPRODUCTO = Target.the("Click para seleccionar el producto que deseo comprar")
			.locatedBy("//img[@src='//i.linio.com/p/365296d8790e54b301506ec83a75d39d-card.jpg']");
	
	public static final Target CLICK_AÑADIRALCARRITO = Target.the("Click para añadir producto al carrito")
			.locatedBy("//button[@class='btn btn-lg hidden-sm-down btn-primary']");
	
	public static final Target CLICK_IRALCARRITO = Target.the("Click para ir al carrito de compra")
			.locatedBy("//a[@class='btn btn-sm btn-go-to-cart added-product'] ");
	
	public static final Target TEXTO_ENCONTRADO = Target.the("Verifica que el producto está en el carrito")
			.locatedBy("//h4[@class='title-summary']");

}
