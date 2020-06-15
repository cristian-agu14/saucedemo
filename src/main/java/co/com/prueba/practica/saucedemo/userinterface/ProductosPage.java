package co.com.prueba.practica.saucedemo.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class ProductosPage {

	public static final Target TEXTO_PRODUCTS = Target.the("Texto products que existe cuando el usuario se ha logueado")
			.locatedBy("//div[@class='product_label']");

	public static final Target BOTON_ADD = Target
			.the("Boton para agregar productos al carrito con respecto al nombre del producto").locatedBy(
					"((//div[@class='inventory_item_name' and contains(text(),'{0}')]//ancestor::div[1])[1]//following::div//button)[1]");

}
