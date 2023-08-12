package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class AmazonHomePage {
    private WebDriver driver;

    public AmazonHomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Cookies akzeptieren
    public void cerezAccept()  {
        driver.findElement(By.id("a-autoid-0")).click();
    }


}

