import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class CartPage {

    private static By removeButton = By.cssSelector("[name='remove_cart_item']");
    private static By emptyCart = By.cssSelector("[id='checkout-cart-wrapper'] em");

    public static void clickRemoveButton() {
        $(removeButton).click();
    }

    public static void validateEmptyCartIsDisplayed() {
        $(emptyCart).shouldBe(visible);
    }

    public static void validateCartIsEmptyText(String expectedText) {
        $(emptyCart).shouldHave(text(expectedText));
    }

}
