package pl.stqa.pft.adressbook.tests;

import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pl.stqa.pft.adressbook.appmanager.ApplcationManager;


public class TestBase {

    protected final ApplcationManager app = new ApplcationManager(BrowserType.FIREFOX);

    @BeforeMethod
    public void setUp() throws Exception {

        app.init();
    }

    @AfterMethod
    public void tearDown() {
        app.stop();
    }


}
