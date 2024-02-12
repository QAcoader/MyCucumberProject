package com.sample.cucumberProject.Pages;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sample.cucumberProject.Steps.Setup.TestBase;

public class RegistrationPage extends TestBase {

	HomePage launch = new HomePage();

	public void Registration() {

		String randomEmail = generateRandomEmail();

		driver.findElement(By.xpath("//header//nav/div/button")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//button/span[text()='Log in']/following::button[1]")));

		driver.findElement(By.xpath("//button/span[text()='Log in']/following::button[1]")).click();

		wait.until(ExpectedConditions.elementToBeClickable(By.id("username")));

		driver.findElement(By.id("username")).sendKeys(randomEmail + Keys.ENTER);

		driver.findElement(By.id("password")).sendKeys("India@1234");

		driver.findElement(By.xpath("//input[@type='checkbox']")).click();

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button/span[text()='Sign up']")));
		driver.findElement(By.xpath("//button/span[text()='Sign up']")).click();

	}

	private String generateRandomEmail() {
		String allowedChars = "abcdefghijklmnopqrstuvwxyz1234567890";
		StringBuilder email = new StringBuilder();
		Random random = new Random();

		// Generate a random string for the local part of the email
		for (int i = 0; i < 10; i++) {
			int index = random.nextInt(allowedChars.length());
			email.append(allowedChars.charAt(index));
		}
		email.append("@xcite.com");

		return email.toString();
	}

}
