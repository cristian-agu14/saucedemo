package co.com.prueba.practica.saucedemo.interactions;

import static co.com.prueba.practica.saucedemo.userinterface.ProductosPage.BOTON_ADD;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;

public class AgregarAlCarrito implements Interaction {

	private String nombreProducto;

	public AgregarAlCarrito() {
		// It's empty intentionally
	}

	public AgregarAlCarrito(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Check.whether((BOTON_ADD.of(nombreProducto)).resolveFor(actor).isPresent())
				.andIfSo(Click.on(BOTON_ADD.of(nombreProducto))).otherwise(RecordarContador.deproductosNoAdd()));
	}

	public static AgregarAlCarrito porElNombre(String producto) {
		return instrumented(AgregarAlCarrito.class, producto);
	}

}
