import org.testng.annotations.Test;

public class CartTest extends TestBase {

    @Test
    public void deleteItemFromCart() {

        HomePage.clickRedDuckLink();
        RedDuckPage.clickAddToCartButton();
        RedDuckPage.getItemsQuantity("1");
        RedDuckPage.clickCheckoutLink();
        CartPage.clickRemoveButton();
        CartPage.validateEmptyCartIsDisplayed();
        CartPage.validateCartIsEmptyText("There are no items in your cart.");

    }

}
