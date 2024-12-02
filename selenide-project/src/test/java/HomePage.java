import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    private static By rubberDucksLink = By.cssSelector("#site-menu .category-1>a");
    private static By redDuckLink = By.cssSelector("a[href][title='Red Duck']");

    public static void clickRubberDucksLink() {
        $(rubberDucksLink).click();
    }

    public static void clickRedDuckLink() {
        $(redDuckLink).click();
    }

}
