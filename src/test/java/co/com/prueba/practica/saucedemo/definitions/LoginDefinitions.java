package co.com.prueba.practica.saucedemo.definitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import co.com.prueba.practica.saucedemo.utils.WebDriverFactory;
import cucumber.api.java.Before;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;

public class LoginDefinitions {

	@Managed(driver = "chrome")
	WebDriver driver;

	@Before
	public void actorAtributtes() {
		OnStage.setTheStage(new OnlineCast());
		theActorCalled("Actor").can(BrowseTheWeb.with(driver));

	}

	@Dado("que  el Analista accede al portal (.*)")
	public void queElAnalistaAccedeAlPortal(String page) throws FileNotFoundException, IOException {
		theActorInTheSpotlight().whoCan(BrowseTheWeb.with(WebDriverFactory.web().onPage(page)));
	}

	@Cuando("se ingresan las credenciales correctas")
	public void seIngresanLasCredencialesCorrectas() {
		
	}

	@Entonces("se observa el ingreso al aplicativo swaglabs")
	public void seObservaElIngresoAElAplicativoSwaglabs() {

	}

}
