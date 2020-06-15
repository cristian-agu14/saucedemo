package co.com.prueba.practica.saucedemo.tasks;

import java.util.List;

import co.com.prueba.practica.saucedemo.interactions.AgregarAlCarrito;
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
		listaProductos.forEach(p -> actor.attemptsTo(AgregarAlCarrito.porElNombre(p)));
	}

	public static AgregarProductos alCarrito(List<String> listaProductos) {
		return Tasks.instrumented(AgregarProductos.class, listaProductos);
	}

}
