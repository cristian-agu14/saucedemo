package co.com.prueba.practica.saucedemo.tasks;

import static co.com.prueba.practica.saucedemo.utils.VariablesRemember.LISTA_PRODUCTOS;
import static co.com.prueba.practica.saucedemo.utils.VariablesRemember.TAMANIO_PRODUCTOS;

import java.util.List;

import co.com.prueba.practica.saucedemo.interactions.AgregarAlCarrito;
import co.com.prueba.practica.saucedemo.interactions.GuardarTotalCompra;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class AgregarProductos implements Task {

	private List<String> listaProductos;

	public AgregarProductos() {
		// It's empty intentionally
	}

	public AgregarProductos(List<String> listaProductos) {
		this.listaProductos = listaProductos;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.remember(TAMANIO_PRODUCTOS, listaProductos.size());
		actor.remember(LISTA_PRODUCTOS, listaProductos);
		listaProductos.forEach(p -> {
			actor.attemptsTo(AgregarAlCarrito.porElNombre(p));
			actor.attemptsTo(GuardarTotalCompra.deLosProductos(p));
		});
	}

	public static AgregarProductos alCarrito(List<String> listaProductos) {
		return Tasks.instrumented(AgregarProductos.class, listaProductos);
	}

}
