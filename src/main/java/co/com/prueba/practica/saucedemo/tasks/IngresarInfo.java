package co.com.prueba.practica.saucedemo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static co.com.prueba.practica.saucedemo.userinterface.CheckoutPage.CAMPO_TEXT_NOMBRE;
import static co.com.prueba.practica.saucedemo.userinterface.CheckoutPage.CAMPO_TEXT_APELLIDO;
import static co.com.prueba.practica.saucedemo.userinterface.CheckoutPage.CAMPO_TEXT_CODIGO_POSTAL;
import static co.com.prueba.practica.saucedemo.userinterface.CheckoutPage.BOTON_CONTINUE;

public class IngresarInfo implements Task {

	private String nombre;
	private String apellido;
	private String codigoPostal;

	public IngresarInfo() {
		// It's empty intentionally
	}

	public IngresarInfo(String nombre, String apellido, String codigoPostal) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.codigoPostal = codigoPostal;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.keyValues(nombre).into(CAMPO_TEXT_NOMBRE));
		actor.attemptsTo(Enter.keyValues(apellido).into(CAMPO_TEXT_APELLIDO));
		actor.attemptsTo(Enter.keyValues(codigoPostal).into(CAMPO_TEXT_CODIGO_POSTAL));
		actor.attemptsTo(Click.on(BOTON_CONTINUE));

	}

	public static IngresarInfo delComprador(String nombre, String apellido, String codigoPostal) {
		return Tasks.instrumented(IngresarInfo.class, nombre, apellido, codigoPostal);
	}

}
