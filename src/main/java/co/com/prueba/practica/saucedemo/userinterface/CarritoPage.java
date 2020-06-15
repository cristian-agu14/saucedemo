package co.com.prueba.practica.saucedemo.userinterface;

import net.serenitybdd.screenplay.targets.Target;

/**
 * Clase para los elemento de la pagina del carrito
 * 
 * @author Cristian
 *
 */
public class CarritoPage {

	public static final Target NOMBRE_PRODUCTO = Target.the("Target para insertar el nombre del producto")
			.locatedBy("//div[@class='inventory_item_name'and contains(text(),'{0}')]");

	public static final Target BOTON_CHECKOUT = Target.the("Boton para ir al checkout de la informacion personal")
			.locatedBy("//a[@class='btn_action checkout_button']");

}
