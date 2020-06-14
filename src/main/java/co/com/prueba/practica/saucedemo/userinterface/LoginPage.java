package co.com.prueba.practica.saucedemo.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

	public static final Target CAMPO_TEXTO_USER_NAME = Target.the("Campo de texto para ingresar el nombre de usuario")
			.located(By.id("user-name"));

	public static final Target CAMPO_TEXTO_PASSWORD = Target.the("Campo de texto para ingresar la contrasenia")
			.located(By.id("password"));

}
