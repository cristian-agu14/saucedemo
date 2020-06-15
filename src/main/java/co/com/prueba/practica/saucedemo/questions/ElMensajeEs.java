package co.com.prueba.practica.saucedemo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static co.com.prueba.practica.saucedemo.userinterface.FinishPage.TEXTO_FINAL;

/**
 * Esta question obtiene el texto generado despuesde realizar la compra y lo
 * retorna para poder ser evaluado con un Matcher
 * 
 * @author Cristian
 *
 */
public class ElMensajeEs implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {
		return TEXTO_FINAL.resolveFor(actor).getText();
	}

	public static ElMensajeEs igualA() {
		return new ElMensajeEs();
	}

}
