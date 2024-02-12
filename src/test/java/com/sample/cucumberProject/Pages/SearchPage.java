package com.sample.cucumberProject.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

import com.sample.cucumberProject.Steps.Setup.TestBase;

public class SearchPage extends TestBase {

	public void clickaddtocart() throws InterruptedException {

		WebElement element = driver
				.findElement(By.xpath("//*[contains(@class,'col-span-4 sm:col-span-12 md:col-span-9')]/ul/li[2]//img"));
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();

		By by = By.xpath(
				"//*[contains(@class,'col-span-4 sm:col-span-12 md:col-span-9')]/ul/li[2]//button/span[text()='Add to cart']");

		action.moveToElement(driver.findElement(by)).click().perform();

//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//		wait.until(ExpectedConditions.elementToBeClickable(by));
//
//		driver.findElement(by).click();
		Thread.sleep(5000);

	}

}
