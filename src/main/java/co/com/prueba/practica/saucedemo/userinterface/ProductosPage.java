package co.com.prueba.practica.saucedemo.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class ProductosPage {

	public static final Target TEXTO_PRODUCTS = Target.the("Texto products que existe cuando el usuario se ha logueado")
			.locatedBy("//div[@class='product_label']");

}
