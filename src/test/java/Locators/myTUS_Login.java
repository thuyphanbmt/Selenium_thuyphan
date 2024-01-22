package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class myTUS_Login {

    public static void main(String[] args) {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        // Step 1: Open the web page
        driver.get("https://dev.mytus.ch/");

        // Step 2: Find and enter the username
        WebElement usernameElement = driver.findElement(By.xpath("//input[@data-test='login_page.username_label']"));
        usernameElement.click();
        usernameElement.sendKeys("mytus-admin@soxes.ch");

        // Step 4: Find and click the "Next" button
        WebElement nextButton = driver.findElement(By.xpath("//button[@data-test='login-button']"));
        nextButton.click();

        // Step 5: Find and enter the password
        WebElement passwordElement = driver.findElement(By.xpath("//input[@data-test='login_page.password_label']"));
        passwordElement.click();
        passwordElement.sendKeys("abcABC!!3");

        // Step 7: Click the "Next" button
        nextButton.click();

        // Step 8: Find and enter the code
        WebElement codeElement = driver.findElement(By.xpath("//input[@data-test='login_page.code_label']"));
        codeElement.click();
        codeElement.sendKeys("123456");

        // Step 10: Click the "Login" button
        WebElement loginButton = driver.findElement(By.xpath("//button[@data-test='login-button']"));
        loginButton.click();

        // Close the browser
        driver.quit();
    }
}