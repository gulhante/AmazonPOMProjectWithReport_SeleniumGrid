package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonLoginPage {

    private WebDriver driver;

    public AmazonLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Login Email auf der Website
    public void loginEmail()  {
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("xxxx");
        driver.findElement(By.xpath("//input[@id='continue']")).click();
    }

    // Login Password auf der Website
    public void loginPassword()  {
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("xxxxx");
    }

    // Anmelden click
    public void login()  {
        driver.findElement(By.id("signInSubmit")).click();
    }


    // Überprüfen Sie, ob der Abmeldevorgang abgeschlossen ist.
    public String abmeldenVerify() {
        return driver.findElement(By.xpath("//h1[@class='a-spacing-small']")).getText();
    }
}
