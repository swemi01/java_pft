package pl.stqa.pft.adressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationHelper extends  HelperBase{
    private WebDriver wd;

    public NavigationHelper(WebDriver wd) {
        super(wd);
    }

    public void goToGroupPage() {
        click(By.linkText("groups"));

    }

    public void goToContactPage() {
        click(By.linkText("add new"));

    }

    public void goToHomePage() {
        click(By.linkText("home"));
    }
}
