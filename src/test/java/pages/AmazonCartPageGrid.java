package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class AmazonCartPageGrid{

    private WebDriver driver;

    public AmazonCartPageGrid(WebDriver driver) {
        this.driver = driver;
    }
    // Die Anzahl der im Warenkorb gekauften {amount} Artikel wurde erhöht
    public void mengeDropDown() {
        WebElement mengeDropdown = driver.findElement(By.id("quantity"));
        Select select = new Select(mengeDropdown);
        select.selectByVisibleText("3");
    }


    // Der Betrag im Warenkorb muss als Produktpreis*Betrag angegeben werden.
    public double price() {
        WebElement productPrice = driver.findElement(By.xpath("//div[@class='sc-badge-price-to-pay']"));
        String pp = productPrice.getText().replace("$", "").replace(" ", "").replace(",", ".");
        return Double.parseDouble(pp);
    }


    // Der Betrag im Warenkorb muss als Produktpreis*Betrag angegeben werden.
    public double priceSumme()  {
        WebElement productPriceSumme = driver.findElement(By.xpath("//*[@id='sc-subtotal-amount-activecart']/span"));
        String ppS = productPriceSumme.getText().replace("$", "").replace(" ", "").replace(",", ".");
        return Double.parseDouble(ppS);
    }


    // Das hinzugefügte Produkt wird aus dem Warenkorb gelöscht.
    public WebElement loschen()  {
       return driver.findElement(By.xpath("//input[@value='Löschen']"));
    }


    // Es wird geprüft, ob die Löschung erfolgt ist oder nicht.
    public String loschenVerify()  {
        return driver.findElement(By.xpath("//h1[@class='a-spacing-mini a-spacing-top-base']")).getText();
    }
}
