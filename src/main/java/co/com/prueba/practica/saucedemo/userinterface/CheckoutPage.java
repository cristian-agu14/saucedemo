package co.com.prueba.practica.saucedemo.userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class CheckoutPage {

	public static final Target CAMPO_TEXT_NOMBRE = Target.the("Compo de texto para el nombre")
			.located(By.id("first-name"));

	public static final Target CAMPO_TEXT_APELLIDO = Target.the("Compo de texto para el apellido")
			.located(By.id("last-name"));

	public static final Target CAMPO_TEXT_CODIGO_POSTAL = Target.the("Compo de texto para el codigo postal")
			.located(By.id("postal-code"));

	public static final Target BOTON_CONTINUE = Target.the("Boton continue")
			.locatedBy("//input[@class='btn_primary cart_button']");

}
