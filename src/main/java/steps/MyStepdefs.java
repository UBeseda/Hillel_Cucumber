//Написать сценарий в фича файле, который вводит значение в поле Проверка сертификата
// на странице https://certificate.ithillel.ua/ и проверяет что появляется надпись: "Сертификат не найден".

package steps;

import configuration.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import pageobjects.CertificatePageObject;

public class MyStepdefs extends BaseClass {
    static CertificatePageObject certificatePageObject = PageFactory.initElements(driver, CertificatePageObject.class);

    @When("I open page {string}")
    public void iOpenPage(String url) {
        driver.get(url);
    }

    @And("Enter keys {string} in  search field")
    public void enterKeysInSearchField(String str) {
        certificatePageObject.sendKeysToSerchField(str);
    }

    @Then("Get message {string}")
    public void getMessage(String str) {
        certificatePageObject.verifyValidationMessage();
    }
}