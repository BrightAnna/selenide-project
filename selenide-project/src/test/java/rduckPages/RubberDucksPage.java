package rduckPages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

import io.qameta.allure.Step;

public class RubberDucksPage {

    private static By buttonName = By.xpath("//div[@id='box-category']//a[text()='Name']");
    private static By activeButtonLocator = By.cssSelector(".button.active");

    @Step("Click 'Name' button")
    public static void clickButtonName() {
        $(buttonName).click();
    }

    @Step("Validate that 'Name' button is active")
    public static void validateActiveButtonName(String expectedText) {
        $(activeButtonLocator).shouldHave(text(expectedText));
    }

}