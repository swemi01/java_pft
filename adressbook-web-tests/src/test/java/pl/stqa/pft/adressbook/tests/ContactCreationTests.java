package pl.stqa.pft.adressbook.tests;

import org.testng.annotations.Test;

import pl.stqa.pft.adressbook.model.ContactData;

public class ContactCreationTests extends TestBase {


    @Test
    public void testContactCreation() {

        app.getNavigationHelper().goToContactPage();
        app.fillContactForm(new ContactData("szymon", "szymon", "sawczuk", "ssawczuk", "ja", "house", "stradomska 1", "stradomska 1\nwarszawa", "stradomska", "123321432"));
        app.submitContactCreation();
    }


}
