package com.qualitystream.tutorial;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {
	private WebDriver driver;
	
	@Before
	public void setUp() {
		// Importamos el chromedriver
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		// Que maximice la ventana donde se van a ejecutar las pruebas
		driver.manage().window().maximize();
		// Acá ingresamos la url de lo que queremos probar
		driver.get("http://google.com.ar");
	}
	
	
	@Test //lugar donde corremos las pruebas
	public void testGooglePage() {
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.clear();
		searchbox.sendKeys("Candela");
		searchbox.submit();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		assertEquals("Candela - Buscar con Google", driver.getTitle());
	}
	
	
	@After
		public void tearDown() {
			driver.quit();
		}
	
}

