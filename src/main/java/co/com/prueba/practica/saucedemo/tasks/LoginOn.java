package co.com.prueba.practica.saucedemo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.prueba.practica.saucedemo.userinterface.LoginPage.BOTON_LOGIN;
import static co.com.prueba.practica.saucedemo.userinterface.LoginPage.CAMPO_TEXTO_PASSWORD;
import static co.com.prueba.practica.saucedemo.userinterface.LoginPage.CAMPO_TEXTO_USER_NAME;

/**
 * Esta tarea tiene como objetivo realizar el login en la aplicaion
 * 
 * @author Cristian
 *
 */
public class LoginOn implements Task {

	/**
	 * En este metodo utilizamos variables del sistema para traer los valores de
	 * usuario y clave, esto con el objetivo de no dejar estos datos expuestos ya
	 * que son sensibles
	 */
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.keyValues(System.getProperty("user")).into(CAMPO_TEXTO_USER_NAME));
		actor.attemptsTo(Enter.keyValues(System.getProperty("password")).into(CAMPO_TEXTO_PASSWORD));
		actor.attemptsTo(Click.on(BOTON_LOGIN));
	}

	public static LoginOn page() {
		return Tasks.instrumented(LoginOn.class);
	}

}
