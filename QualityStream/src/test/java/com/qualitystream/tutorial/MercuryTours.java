package com.qualitystream.tutorial;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercuryTours {
	private WebDriver driver;
	By registerLinkLocator = By.linkText("REGISTER");
	By registerPageLocator = By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/img");
	By usernameLocator = By.id("email");
	By passwordLocator = By.name("password");
	By confirmPassLocator = By.name("confirmPassword");
	By buttonRegisterLocator = By.name("submit");
	By confirmationLocator = By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/font/b");
	By homeLocator = By.linkText("Home");
	// LOGIN
	By usernameLogin = By.name("username");
	By passLogion = By.name("password");
	By buttLogin = By.name("submit");
	By pasoRegister = By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/h3");
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/");
	}
	
	@Test
	public void registerUser() throws InterruptedException {
		driver.findElement(registerLinkLocator).click();
		Thread.sleep(2000);
			if (driver.findElement(registerPageLocator).isDisplayed()) {
				driver.findElement(usernameLocator).sendKeys("Loquinchilla");
				driver.findElement(passwordLocator).sendKeys("pass");
				driver.findElement(confirmPassLocator).sendKeys("pass");
				
				driver.findElement(buttonRegisterLocator).click();
			}
			else {
				System.out.println("Se rompió todo");
			}
			
			equals("Note: Your user name is loquinchilla.");
		}
	
	@After
	public void tearDown() {
		driver.quit();
	}

}
