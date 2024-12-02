import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

import io.qameta.allure.Step;

public class LoginPage {

    private static By emailInput = By.name("email");
    private static By passwordInput = By.name("password");
    private static By loginButton = By.name("login");
    private static By errorMassageText = By.cssSelector(".notice.errors");

    public static void typeEmail(String email) {
        $(emailInput).sendKeys(email);
    }

    public static void typePassword(String password) {
        $(passwordInput).sendKeys(password);
    }

    public static void clickButton() {
        $(loginButton).click();
    }

    //    @Step("Login with defined credentials")
    public static void loginWithCredentials(String email, String password) {
        typeEmail(email);
        typePassword(password);
        clickButton();
    }

    //    @Step("Validate that the error message is displayed")
    public static void validateMessageIsDisplayed() {
        $(errorMassageText).shouldBe(visible);
    }

    //    @Step("Validate that the error message text matches expectation")
    public static void validateErrorMessageText(String expectedText) {
        $(errorMassageText).shouldHave(text(expectedText));
    }


}