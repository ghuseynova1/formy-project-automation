package com.gunelapp.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Chapter5 {
    public static void main(String[] args)  {
        System.setProperty("webdriver.chrome.driver","D:\\Projects\\selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/autocomplete");
        //implicitlywait
        /*WebElement autoComplete = driver.findElement(By.id("autocomplete"));
        autoComplete.sendKeys("1555 Park Blvd, Palo Alto, CA");
        //Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement autoCompleteResult = driver.findElement(By.className("pac-item"));
        autoCompleteResult.click();*/

        //explicitwait
        WebElement autoComplete = driver.findElement(By.id("autocomplete"));
        autoComplete.sendKeys("1555 Park Blvd, Palo Alto, CA");
        WebDriverWait wait = new WebDriverWait(driver,10);
        WebElement autoCompleteResult = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("pac-item")));
        autoCompleteResult.click();


    }
}
