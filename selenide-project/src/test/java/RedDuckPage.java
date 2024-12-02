import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class RedDuckPage {

    private static By addToCartButton = By.cssSelector("[type='submit'][name='add_cart_product']");
    private static By cartQuantityLabel = By.cssSelector("span[class='quantity']");
    private static By checkoutLink = By.cssSelector("#cart a[href].link");


    public static void clickAddToCartButton() {
        $(addToCartButton).click();
    }

    public static void getItemsQuantity(String expectedText) {
        $(cartQuantityLabel).shouldHave(text(expectedText));
    }

    public static void clickCheckoutLink() {
        $(checkoutLink).click();
    }

}