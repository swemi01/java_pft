package pl.stqa.pft.adressbook.appmanager;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

public class ApplcationManager {

    private final ContactHelper contactHelper = new ContactHelper();
    private SessionHelper sessionHelper;
    private NavigationHelper navigationHelper;
    private GroupHelper groupHelper;

    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    public void init() {
        contactHelper.wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
        contactHelper.wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        contactHelper.wd.get("http://localhost/addressbook/");
        groupHelper = new GroupHelper(contactHelper.wd);
        navigationHelper = new NavigationHelper(contactHelper.wd);
        sessionHelper = new SessionHelper(contactHelper.wd);
        sessionHelper.login("admin", "secret");
    }



    public void stop() {
        contactHelper.wd.quit();
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }

    public ContactHelper getContactHelper() {
        return contactHelper;
    }
}
