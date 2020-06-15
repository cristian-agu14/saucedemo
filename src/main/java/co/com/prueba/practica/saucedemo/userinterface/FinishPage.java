package co.com.prueba.practica.saucedemo.userinterface;

import net.serenitybdd.screenplay.targets.Target;

/**
 * Clase para los elementos de la pagina final de la compra
 * 
 * @author Cristian
 *
 */
public class FinishPage {

	public static final Target TEXTO_FINAL = Target.the("Texto del final de la compra")
			.locatedBy("//h2[@class='complete-header']");

}
