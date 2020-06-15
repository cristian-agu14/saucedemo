package co.com.prueba.practica.saucedemo.interactions;

import static co.com.prueba.practica.saucedemo.userinterface.ProductosPage.PRECIO_PRODUCTO;
import static co.com.prueba.practica.saucedemo.utils.VariablesRemember.PRECIO_TOTAL;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class GuardarTotalCompra implements Interaction {

	private String nombreProducto;

	public GuardarTotalCompra() {
		// It's empty intentionally
	}

	public GuardarTotalCompra(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		Double precio = actor.recall(PRECIO_TOTAL);
		if (precio == null) {
			precio = 0.0;
		}
		if (PRECIO_PRODUCTO.of(nombreProducto).resolveFor(actor).isPresent()) {
			String precioString = PRECIO_PRODUCTO.of(nombreProducto).resolveFor(actor).getText();
			precioString = precioString.replace("$", "");
			precio = precio + Double.parseDouble(precioString);
			actor.remember(PRECIO_TOTAL, precio);
		}
	}

	public static GuardarTotalCompra deLosProductos(String nombreProducto) {
		return instrumented(GuardarTotalCompra.class, nombreProducto);
	}

}
