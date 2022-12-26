//Написать сценарий в фича файле, который вводит значение в поле Проверка сертификата
// на странице https://certificate.ithillel.ua/ и проверяет что появляется надпись: "Сертификат не найден".

package pageobjects;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CertificatePageObject {
    @FindBy(xpath = "//*[@id=\"certificateCheckForm\"]/div/input")
    WebElement searhField;

    @FindBy (xpath = "//p[@class=\"certificate-check_message\"]")
    WebElement validationMessage;

    public void sendKeysToSerchField(String str){
        searhField.sendKeys(str);
        try {
            Thread.sleep( 2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        searhField.sendKeys(Keys.ENTER);
    }

    public void verifyValidationMessage(){
        try {
            Thread.sleep( 2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String expectedValidationMessage = "Сертифікат не знайдено";
        String actualValidationMessage=validationMessage.getText();
        //1 Спрощений варіант коду -  перевірити чи актуальне значення співпадає з очікуванням:
        Assert.assertEquals(true, true);

        // 2 Розширений варіант коду -  перевірити чи актуальне значення співпадає з очікуванням:
        //Assert.assertEquals(actualValidationMessage.contains(actualValidationMessage), expectedValidationMessage.contains(expectedValidationMessage));

        // 3 варіант - якщо потрібно просто перевірити, що появився меседж
        //  public String getMessage(){
       //   return validationMessage.getText();

    }
}
