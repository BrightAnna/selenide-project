import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class RubberDucksPage {

    private static By buttonName = By.xpath("//div[@id='box-category']//a[text()='Name']");
    private static By activeButtonLocator = By.cssSelector(".button.active");

    public static void clickButtonName() {
        $(buttonName).click();
    }

    public static void validateActiveButtonName(String expectedText) {
        $(activeButtonLocator).shouldHave(text(expectedText));
    }

}