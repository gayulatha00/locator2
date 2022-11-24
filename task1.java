package org.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
	/*	driver.get("https://www.redbus.in/");
        WebElement a = driver.findElement(By.xpath("//input[@id='src']"));
        a.sendKeys("kovilambakkam");
        WebElement b = driver.findElement(By.xpath("//input[@id='dest']"));
        b.sendKeys("madipakkam");
       // driver.close();
	*/
		driver.get("http://www.greenstechnologys.com/");
		WebElement course= driver.findElement(By.xpath("//a[text()='COURSES']"));
		Actions act = new Actions(driver);
		act.moveToElement(course).perform();
		WebElement Oracle = driver.findElement(By.xpath("//span[text()='Oracle Training']"));
		act .moveToElement(Oracle).build().perform();
		WebElement ad=driver.findElement(By.xpath("//span[text()='SQL Certification']"));
	    act .moveToElement(ad).click().perform();


	}

}
