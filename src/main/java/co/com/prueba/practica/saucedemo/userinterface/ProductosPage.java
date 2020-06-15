package co.com.prueba.practica.saucedemo.userinterface;

import net.serenitybdd.screenplay.targets.Target;

/**
 * Clase para los elementos de la pagina de los productos
 * 
 * @author Cristian
 *
 */
public class ProductosPage {

	public static final Target TEXTO_PRODUCTS = Target.the("Texto products que existe cuando el usuario se ha logueado")
			.locatedBy("//div[@class='product_label']");

	public static final Target BOTON_ADD = Target
			.the("Boton para agregar productos al carrito con respecto al nombre del producto").locatedBy(
					"((//div[@class='inventory_item_name' and contains(text(),'{0}')]//ancestor::div[1])[1]//following::div//button)[1]");

	public static final Target NUM_CARRITO = Target.the("Numero de productos en el carrito")
			.locatedBy("//span[@class='fa-layers-counter shopping_cart_badge']");

	public static final Target BOTON_CARRITO = Target.the("Boton para entrar al carrito")
			.locatedBy("//a[@class='shopping_cart_link fa-layers fa-fw']");

	public static final Target PRECIO_PRODUCTO = Target.the("Precio del producto dependiendo del nombre").locatedBy(
			"((//div[@class='inventory_item_name' and contains(text(),'{0}')]//ancestor::div[1])[1]//following::div[@class='inventory_item_price'])[1]");

}
