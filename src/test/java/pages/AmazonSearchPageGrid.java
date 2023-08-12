package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class AmazonSearchPageGrid {

    private WebDriver driver;

    public AmazonSearchPageGrid(WebDriver driver) {
        this.driver = driver;
    }

    // Die Suchergebnisseite wird geöffnet und überprüft
    public String searchText() {
        WebElement searchText = driver.findElement(By.xpath("//span[@class='a-color-state a-text-bold']"));
       return searchText.getText();
    }


    // Auf die 2. Seite der Suchergebnisse navigieren
    public void seiteZweiClick()  {
        WebElement seiteZwei = driver.findElement(By.xpath("//a[@aria-label='Zu Seite 2']"));
        seiteZwei.click();
    }


    // 2. Seite wird geöffnet und überprüft
    public WebElement seiteZweiVerify()  {
        WebElement seiteZweiVerify = driver.findElement(By.xpath("//span[@aria-label='Aktuelle Seite, Seite 2']"));
        return seiteZweiVerify;
    }


    // Wählen Sie das zweite Produkt aus
    public WebElement products() {
        List<WebElement> productsList = new ArrayList<>(driver.findElements(By.className("s-image")));
        return productsList.get(1);
    }


    // Das zweite Produkt auf der Seite wird dem Warenkorb hinzugefügt.
    public void addtoCart()  {
        driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[1]")).click();
    }



    // Überprüfen Sie, ob das Produkt zum Warenkorb hinzugefügt wurde.
    public String hinzufugen()  {
        return  driver.findElement(By.xpath("//*[@id=\"NATC_SMART_WAGON_CONF_MSG_SUCCESS\"]/span")).getText();
    }


    // Überprüfen Sie, ob die Warenkorbseite geöffnet ist.
    public void einkaufswagwen()  {
        driver.findElement(By.xpath("//*[@id='sw-gtc']/span/a")).click();
    }

}
