package project5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**
 * 1. Setup chrome browser
 * 2. Open URL
 * 3. Print the title of the page
 * 4. Print the current url
 * 5. Print the page source
 * 6. Enter the email to email field
 * 7. Enter the password to password field
 * 8. Close the browser
 */
public class SignInTest {
    public static void main(String[] args) {

        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        // Launch the Chrome Browser
        WebDriver driver = new ChromeDriver();
        //  Open the URL into Browser
        driver.get(baseUrl);
        //Maximise Browser
        driver.manage().window().maximize();
        // We give Implicit wait to Driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // Print the title of the page
        System.out.println("Title of Page:" + driver.getTitle());
        // Print the current url
        System.out.println("Current URL: " + driver.getCurrentUrl());
        // Print the page source
        System.out.println(" Source page : " + driver.getPageSource());
        // Enter the email to email field
        WebElement emailField = driver.findElement(By.id("user[email]"));
        // Action
        emailField.sendKeys("Shopping@gmail.com");
        // Enter the password to password field
        WebElement passwordField = driver.findElement(By.id("user[password]"));
        // Action
        passwordField.sendKeys("shoP12547");
        //Close the browser
        driver.close();
    }


}
