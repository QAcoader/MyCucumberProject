/**
 * 
 */
package com.sample.cucumberProject.Pages;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sample.cucumberProject.Steps.Setup.TestBase;

/**
 * 
 */
public class HomePage extends TestBase {

	public void launchHomePage() throws InterruptedException {

		driver.get(props.getAppURL());
		Thread.sleep(2000);
		Assert.assertEquals("Xcite: Kuwait's Leading Online Shopping Electronics Store", driver.getTitle());

	}

	public void login() {

		driver.findElement(By.xpath("//header//nav/div/button")).click();
		driver.findElement(By.id("username")).sendKeys("ganesh.jdhv1@yahoo.com" + Keys.ENTER);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.until(ExpectedConditions.elementToBeClickable(By.id("password")));
		driver.findElement(By.id("password")).sendKeys("India@1234");

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button/span[text()='Log in']")));
		driver.findElement(By.xpath("//button/span[text()='Log in']")).click();
	}

	public void search(String searchString) {
		driver.findElement(By.id("search")).sendKeys(searchString + Keys.ENTER);

	}

}
