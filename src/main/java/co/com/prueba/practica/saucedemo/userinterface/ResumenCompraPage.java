package co.com.prueba.practica.saucedemo.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class ResumenCompraPage {

	public static final Target TEXTO_ITEM_TOTAL = Target
			.the("Texto que contiene el valor total de los productos sin tax")
			.locatedBy("//div[@class='summary_subtotal_label']");

	public static final Target BOTON_FINISH = Target.the("Boton para finalizar la compra")
			.locatedBy("//a[@class='btn_action cart_button']");

}
