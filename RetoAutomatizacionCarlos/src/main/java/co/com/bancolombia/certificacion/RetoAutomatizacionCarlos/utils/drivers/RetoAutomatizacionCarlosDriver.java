package co.com.bancolombia.certificacion.RetoAutomatizacionCarlos.utils.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RetoAutomatizacionCarlosDriver {

	private static WebDriver driver;

	public static RetoAutomatizacionCarlosDriver web() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Administrador\\eclipse-workspace\\RetoAutomatizacionCarlos\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximize", "--incognito", "--disabled-infobars");
		driver = new ChromeDriver(options);
		return new RetoAutomatizacionCarlosDriver();
	}

	public WebDriver enLaPagina(String url) {
		driver.get(url);
		return driver;
	}
}
