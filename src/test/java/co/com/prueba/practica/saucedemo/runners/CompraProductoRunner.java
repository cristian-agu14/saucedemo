package co.com.prueba.practica.saucedemo.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "resources/features/productos.feature", 
glue = "co.com.prueba.practica.saucedemo.definitions", snippets = SnippetType.CAMELCASE, tags="")
public class CompraProductoRunner {

}
