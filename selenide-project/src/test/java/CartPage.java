import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class CartPage {

    private static By removeButton = By.cssSelector("[name='remove_cart_item']");
    private static By emptyCart = By.cssSelector("[id='checkout-cart-wrapper'] em");

    //    @Step("Click 'Remove' button")
    public static void clickRemoveButton() {
        $(removeButton).click();
    }

    //   @Step("Validate that the empty cart is displayed")
    public static void validateEmptyCartIsDisplayed() {
        $(emptyCart).shouldBe(visible);
    }

    //    @Step("Validate that the error message text matches expectation")
    public static void validateCartIsEmptyText(String expectedText) {
        $(emptyCart).shouldHave(text(expectedText));
    }

}
