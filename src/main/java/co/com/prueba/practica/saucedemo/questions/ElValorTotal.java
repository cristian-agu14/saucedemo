package co.com.prueba.practica.saucedemo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static co.com.prueba.practica.saucedemo.userinterface.ResumenCompraPage.TEXTO_ITEM_TOTAL;
import static co.com.prueba.practica.saucedemo.utils.VariablesRemember.PRECIO_TOTAL;

public class ElValorTotal implements Question<Boolean> {

	@Override
	public Boolean answeredBy(Actor actor) {
		Double valorProductos = actor.recall(PRECIO_TOTAL);
		String valorTotalString = TEXTO_ITEM_TOTAL.resolveFor(actor).getText();
		String valorTotal = valorTotalString.replaceAll("[A-Za-z: ]\\$*", "");
		return valorTotal.equals(valorProductos + "");
	}

	public static ElValorTotal esCorrecto() {
		return new ElValorTotal();
	}

}
