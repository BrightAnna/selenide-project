import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class RedDuckPage {

    private static By addToCartButton = By.cssSelector("[type='submit'][name='add_cart_product']");
    private static By cartQuantityLabel = By.cssSelector("span[class='quantity']");
    private static By checkoutLink = By.cssSelector("#cart a[href].link");

    //    @Step("Click 'Add To Cart' button")
    public static void clickAddToCartButton() {
        $(addToCartButton).click();
    }

    //    @Step("Validate that the quantity of items in the cart is changed")
    public static void getItemsQuantity(String expectedText) {
        $(cartQuantityLabel).shouldHave(text(expectedText));
    }

    //    @Step("Click 'Checkout' link")
    public static void clickCheckoutLink() {
        $(checkoutLink).click();
    }

}