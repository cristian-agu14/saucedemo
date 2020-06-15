package co.com.prueba.practica.saucedemo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static co.com.prueba.practica.saucedemo.utils.VariablesRemember.TAMANIO_PRODUCTOS;
import static co.com.prueba.practica.saucedemo.utils.VariablesRemember.CONT_PRODUCTOS;
import static co.com.prueba.practica.saucedemo.userinterface.ProductosPage.NUM_CARRITO;

/**
 * 
 * @author Cristian Esta question evalua la cantidad de productos agregados con
 *         la cantidad de productos en pantalla, así se puede asegurar que los
 *         productos que un cliente agregue al carrito sean los que va a ver en
 *         la aplicacion
 */
public class ElNumeroDelCarritoEs implements Question<Boolean> {

	@Override
	public Boolean answeredBy(Actor actor) {

		int tamanioProductos = actor.recall(TAMANIO_PRODUCTOS);
		int productosAdicionados = actor.recall(CONT_PRODUCTOS);
		int totalProductos = tamanioProductos - productosAdicionados;
		int totalCarrito = 0;

		if (NUM_CARRITO.resolveFor(actor).isPresent()) {

			totalCarrito = Integer.parseInt(NUM_CARRITO.resolveFor(actor).getText());
		}

		return totalProductos == totalCarrito;
	}

	public static ElNumeroDelCarritoEs igualALaCantidadProductos() {
		return new ElNumeroDelCarritoEs();
	}

}
