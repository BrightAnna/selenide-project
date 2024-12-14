package rduckPages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    private static By rubberDucksLink = By.cssSelector("#site-menu .category-1>a");
    private static By redDuckLink = By.cssSelector("a[href][title='Red Duck']");

    @Step("Click 'Rubber Ducks' link")
    public static void clickRubberDucksLink() {
        $(rubberDucksLink).click();
    }

    @Step("Click 'Red Ducks' link")
    public static void clickRedDuckLink() {
        $(redDuckLink).click();
    }

}
