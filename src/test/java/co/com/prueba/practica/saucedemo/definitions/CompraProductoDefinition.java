package co.com.prueba.practica.saucedemo.definitions;

import java.util.List;

import co.com.prueba.practica.saucedemo.questions.ElMensajeEs;
import co.com.prueba.practica.saucedemo.questions.ElNumeroDelCarritoEs;
import co.com.prueba.practica.saucedemo.questions.ElValorTotal;
import co.com.prueba.practica.saucedemo.questions.LosProductosEstan;
import co.com.prueba.practica.saucedemo.tasks.AgregarProductos;
import co.com.prueba.practica.saucedemo.tasks.IngresarInfo;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Click;
import static org.hamcrest.Matchers.equalTo;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static co.com.prueba.practica.saucedemo.userinterface.ProductosPage.BOTON_CARRITO;
import static co.com.prueba.practica.saucedemo.userinterface.CarritoPage.BOTON_CHECKOUT;
import static co.com.prueba.practica.saucedemo.userinterface.ResumenCompraPage.BOTON_FINISH;

public class CompraProductoDefinition {

	@Dado("que  el Analista agrega los siguientes productos al carrito")
	public void queElAnalistaAgregaLosSiguientesProductosAlCarrito(List<String> listaProductos) {
		theActorInTheSpotlight().attemptsTo(AgregarProductos.alCarrito(listaProductos));
	}

	@Cuando("se valida que el contador del carrito sea correcto")
	public void seValidaQueElContadorDelCarritoSeaCorrecto() {
		theActorInTheSpotlight().should(seeThat(ElNumeroDelCarritoEs.igualALaCantidadProductos()));
	}

	@Cuando("se ingresa al carrito de compra se ven los productos seleccionados anteriormente")
	public void seIngresaAlCarritoDeCompraSeVenLosProductosSeleccionadosAnteriormente() {
		theActorInTheSpotlight().attemptsTo(Click.on(BOTON_CARRITO));
		theActorInTheSpotlight().should(seeThat(LosProductosEstan.enElCarrito()));
	}

	@Cuando("se realiza el checkout con nombre(.*) apellido(.*) y codigo postal(.*)")
	public void seRealizaElCheckoutConNombreCristianApellidoAgudeloYCodigoPostalCodigoPostal(String nombre,
			String apellido, String codigoPostal) {
		theActorInTheSpotlight().attemptsTo(Click.on(BOTON_CHECKOUT));
		theActorInTheSpotlight().attemptsTo(IngresarInfo.delComprador(nombre, apellido, codigoPostal));
	}

	@Entonces("se valida el valor de la compra")
	public void validarvalorCompra() {
		theActorInTheSpotlight().should(seeThat(ElValorTotal.esCorrecto()));
	}

	@Entonces("se valida el mensaje(.*)")
	public void validarMensaje(String mensaje) {
		theActorInTheSpotlight().attemptsTo(Click.on(BOTON_FINISH));
		theActorInTheSpotlight().should(seeThat(ElMensajeEs.igualA(), equalTo(mensaje)));

	}
}
