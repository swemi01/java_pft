package pl.stqa.pft.adressbook.tests;

import org.testng.annotations.Test;
import pl.stqa.pft.adressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

    @Test
    public void testsContactModification() {
        app.getNavigationHelper().goToHomePage();
        app.getContactHelper().selectContact();
        app.getContactHelper().selectEditContact();
        app.getContactHelper().fillContactForm(new ContactData("szymon", "szymon", "sawczuk", "ssawczuk", "ja", "house", "stradomska 1", "stradomska 1\nwarszawa", "stradomska", "123321432"));
        app.getContactHelper().submitContactModification();
    }
}
