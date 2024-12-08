import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

@Epic("Cart functionality implementation")
@Feature("Cart")
public class CartTest extends TestBase {

    @Description("When user clicks the button 'Remove' on the cart page an item is deleted")
    @Test(description = "Delete an item from the cart")
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
