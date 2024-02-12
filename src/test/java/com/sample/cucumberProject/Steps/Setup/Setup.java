package com.sample.cucumberProject.Steps.Setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Setup {
	static WebDriver dr;

	@Before
	public void setupDriver() {
		PropertiesReader p = new PropertiesReader();
		String s = p.getBrowserName();
		if (s.toLowerCase().equals("safari")) {
			//EdgeOptions options = new EdgeOptions();
			//options.addArguments("--start-maximized");
			WebDriverManager.safaridriver() .setup();
			dr = new SafariDriver();
			dr.manage().window().maximize();

		} else if (s.toLowerCase().equals("firefox")) {
			FirefoxOptions options = new FirefoxOptions();
			WebDriverManager.firefoxdriver().setup();
			dr = new FirefoxDriver(options);
			dr.manage().window().maximize();

		} else {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--start-maximized");
			WebDriverManager.chromedriver().setup();
			dr = new ChromeDriver(options);
		}
	}

	@After
	public void quitDriver() {
		dr.quit();
	}

	public static WebDriver GetDriver() {
		return dr;
	}
}
