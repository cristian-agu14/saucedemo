package co.com.prueba.practica.saucedemo.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static co.com.prueba.practica.saucedemo.utils.VariablesRemember.CONT_PRODUCTOS;
import static co.com.prueba.practica.saucedemo.utils.VariablesRemember.NUM_PRODUCTOS;

public class RecordarContador implements Performable {
	/**
	 * Esta interaccion se ancarga de hacer que el actor recuerde la cantidad de
	 * productos agregados, ya que desde el feature se puden meter en la lista
	 * articulos que no existen en la aplicación
	 */
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.remember(CONT_PRODUCTOS, NUM_PRODUCTOS + 1);
	}

	public static RecordarContador deproductosNoAdd() {
		return instrumented(RecordarContador.class);
	}

}
