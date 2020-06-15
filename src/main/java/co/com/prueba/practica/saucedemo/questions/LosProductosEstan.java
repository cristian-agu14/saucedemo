package co.com.prueba.practica.saucedemo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.prueba.practica.saucedemo.userinterface.ProductosPage.NUM_CARRITO;
import static co.com.prueba.practica.saucedemo.utils.VariablesRemember.LISTA_PRODUCTOS;
import static co.com.prueba.practica.saucedemo.userinterface.CarritoPage.NOMBRE_PRODUCTO;

import java.util.List;

/**
 * Esta Question evalua que los productos en el carrito sean exactamente los que
 * el actor a agregado anteriormente
 * 
 * @author Cristian
 *
 */
public class LosProductosEstan implements Question<Boolean> {
	Integer contProductos = 0;

	/**
	 * En este metodo se utiliza lambda de java 8 para recorrer de manera optima la
	 * lista de productos y contar los productos que existen en el aplicativo
	 */
	@Override
	public Boolean answeredBy(Actor actor) {

		List<String> listaProductos = actor.recall(LISTA_PRODUCTOS);
		int totalCarrito = Integer.parseInt(NUM_CARRITO.resolveFor(actor).getText());

		listaProductos.forEach(p -> {
			if (NOMBRE_PRODUCTO.of(p).resolveFor(actor).isPresent()) {
				contProductos++;
			}

		});

		return totalCarrito == contProductos;
	}

	public static LosProductosEstan enElCarrito() {
		return new LosProductosEstan();
	}

}
