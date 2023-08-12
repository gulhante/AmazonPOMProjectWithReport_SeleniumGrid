package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AmazonBasePageGrid {

    private WebDriver driver;

    public AmazonBasePageGrid(WebDriver driver) {
        this.driver = driver;
    }

    // Kategorien-Tab "Computer" auswählen
    public void selectDropDown(){
        WebElement searchDropdown = driver.findElement(By.id("searchDropdownBox"));
        Select select = new Select(searchDropdown);
        select.selectByVisibleText("Computer");
    }

    // Computer-Kategorie ausgewählt und überprüft
    public String selectedCategoryVerify() {
        WebElement searchDropdown = driver.findElement(By.id("searchDropdownBox"));
        return searchDropdown.getText();
    }

    // In die Suchleiste "msi" eingeben und Suche ausführen
    public void searchArea(String searchWord){
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(searchWord + Keys.ENTER);
    }


    public void cartClick(){
        driver.findElement(By.className("nav-cart-icon nav-sprite")).click();
    }


    // Login click
    public void loginClick(){
        driver.findElement(By.xpath("//a[@data-nav-role='signin']")).click();
    }



    // Login-Seite wird geöffnet und überprüft
    public WebElement loginVerify(){
        WebElement loginVerify = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        return loginVerify;
    }


    // Melden Sie sich ab.
    public void abmelden()  {
        WebElement abmelden = driver.findElement(By.xpath("//a[@data-nav-role='signin']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(abmelden).perform();
       driver.findElement(By.xpath("//span[.='Abmelden']")).click();
    }
}




