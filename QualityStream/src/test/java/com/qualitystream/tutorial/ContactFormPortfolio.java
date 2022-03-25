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

public class ContactFormPortfolio {
	private WebDriver driver;
	By nameLocator = By.name("name");
	By emailLocator = By.name("email");
	By messageLocator = By.name("message");
	By buttonSubmit = By.xpath("//*[@id=\"form\"]/div/div[4]/button");
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://c-godoy.vercel.app");
	}
	
	
	@Test //lugar donde corremos las pruebas
	public void testGooglePage() {
		if (driver.findElement(nameLocator).isDisplayed()) {
			driver.findElement(nameLocator).sendKeys("Juan");
			driver.findElement(emailLocator).sendKeys("correo@email.com");
			driver.findElement(messageLocator).sendKeys("Hola mundo!");
			driver.findElement(buttonSubmit).click();
			
			assertTrue
		}
	}
	
	
	@After
		public void tearDown() {
			driver.quit();
		}
	
}
