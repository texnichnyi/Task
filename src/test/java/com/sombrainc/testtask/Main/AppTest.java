package com.sombrainc.testtask.Main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AppTest {
	@Test
	public void testTask(){
	System.setProperty("webdriver.chrome.driver", "D:\\JAVA\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://redux-form.com/6.5.0/examples/simple/");
	driver.findElement(By.name("firstName")).sendKeys("Yurii");
	driver.findElement(By.name("lastName")).sendKeys("Kushpit");
	driver.findElement(By.name("email")).sendKeys("yuriikushpit@gmail.com");
	driver.findElement(By.cssSelector("input[value='male']")).click();
	Select select = new Select(driver.findElement(By.name("favoriteColor")));
	select.selectByValue("ff0000");
	driver.findElement(By.name("employed")).click();
	driver.findElement(By.name("notes")).sendKeys("Write test task");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
}
