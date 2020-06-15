package co.com.prueba.practica.saucedemo.definitions;

import java.util.List;

import co.com.prueba.practica.saucedemo.tasks.AgregarProductos;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Dado;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CompraProductoDefinition {

	@Dado("que  el Analista agrega los siguientes productos al carrito")
	public void queElAnalistaAgregaLosSiguientesProductosAlCarrito(List<String> listaProductos) {
		theActorInTheSpotlight().attemptsTo(AgregarProductos.alCarrito(listaProductos));
	}

	@Cuando("se valida que el contador del carrito sea correcto")
	public void seValidaQueElContadorDelCarritoSeaCorrecto() {

	}

	@Cuando("se ingresa al carrito de compra se ven los productos seleccionados anteriormente")
	public void seIngresaAlCarritoDeCompraSeVenLosProductosSeleccionadosAnteriormente() {

	}

	@Cuando("se realiza el checkout con nombreCristian apellidoAgudelo y codigo postal<codigoPostal>")
	public void seRealizaElCheckoutConNombreCristianApellidoAgudeloYCodigoPostalCodigoPostal() {

	}

}
