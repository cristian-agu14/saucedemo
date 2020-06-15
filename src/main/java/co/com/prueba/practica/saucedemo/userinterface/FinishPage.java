package co.com.prueba.practica.saucedemo.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class FinishPage {

	public static final Target TEXTO_FINAL = Target.the("Texto del final de la compra")
			.locatedBy("//h2[@class='complete-header']");

}
