package co.com.prueba.practica.saucedemo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static co.com.prueba.practica.saucedemo.userinterface.ProductosPage.TEXTO_PRODUCTS;

public class ElUsuarioEsta implements Question<Boolean> {

	@Override
	public Boolean answeredBy(Actor actor) {
		return TEXTO_PRODUCTS.resolveFor(actor).isPresent();
	}

	public static ElUsuarioEsta logueado() {
		return new ElUsuarioEsta();
	}

}
