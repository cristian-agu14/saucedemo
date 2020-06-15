package co.com.prueba.practica.saucedemo.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Esta clase es una clase factory para levantar un navegador
 * 
 * @author cristian
 *
 */
public class WebDriverFactory {

	private static WebDriver driver;

	public static WebDriverFactory web() {
		driver = getDriver();
		driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return new WebDriverFactory();

	}

	/**
	 * Metodo para obtener el driver necesario
	 * 
	 * @return WebDriver
	 */
	public static WebDriver getDriver() {
		String webdriverstr = System.getProperty("serenity.driver.name");
		if (webdriverstr == null) {
			webdriverstr = "chrome";
		}

		switch (webdriverstr) {
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "resources/drivers/geckodriver.exe");
			FirefoxOptions fireopts = new FirefoxOptions();

			fireopts.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			return new FirefoxDriver();

		case "chrome":
			System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
			ChromeOptions chropts = new ChromeOptions();
			chropts.setAcceptInsecureCerts(true);
			return new ChromeDriver();

		case "edge":
			System.setProperty("webdriver.edge.driver", "resources/drivers/MicrosoftWebDriver.exe");
			DesiredCapabilities capabilities = DesiredCapabilities.edge();
			capabilities.setJavascriptEnabled(true);
			capabilities.setAcceptInsecureCerts(true);

			return new EdgeDriver();
		case "ie":
			System.setProperty("webdriver.ie.driver", "src/test/resources/drivers/IEDriverServer.exe");
			InternetExplorerOptions opts = new InternetExplorerOptions();

			opts.ignoreZoomSettings();
			opts.enablePersistentHovering();
			opts.ignoreZoomSettings();
			opts.introduceFlakinessByIgnoringSecurityDomains();
			opts.requireWindowFocus();
			opts.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

			opts.setCapability("ignoreProctectedModeSettings", true);
			opts.setCapability("enabledNativeEvents", true);

			opts.setCapability("ignoreZoomSetting", true);
			opts.setCapability("ignoreProtectedModeSettings", true);
			opts.setCapability("requireWindowFocus", true);
			opts.setCapability("enableNativeEvents", true);
			opts.setCapability("enablePersistentHover", true);

			return new InternetExplorerDriver(opts);

		default:
			throw new RuntimeException("Unsupported webdriver: " + webdriverstr);
		}
	}

	/**
	 * Metodo que puede abrir la pagina que se le envie
	 * 
	 * @param url
	 *            para abrir en el navegador
	 * @return driver actua
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public WebDriver onPage(String url) throws FileNotFoundException, IOException {
		Properties properties = new Properties();
		properties.load(new FileReader("resources/urls/urls.properties"));
		url = properties.getProperty(url);
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}

	/**
	 * Metodo para obtener una url de un archivo .properties
	 * 
	 * @param parametro
	 *            nombre asignado en al archivo .properties para traer el valor
	 * @return el valor de la propiedad, en este caso una url
	 */
	public String consultar_propertie(String parametro) {
		Properties prop = new Properties();
		InputStream is = null;

		try {
			is = new FileInputStream("src/test/resources/urls/urls.properties");
			prop.load(is);
			return prop.getProperty(parametro);

		} catch (IOException e) {
			System.out.println(e.toString());
		}

		return null;
	}

}
