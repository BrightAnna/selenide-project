import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

@Epic("Product card functionality implementation")
@Feature("RedDuck")
public class RedDuckTest extends TestBase {


    @Description("When user clicks the button 'Add To Cart' the quantity of items in the cart changes")
    @Test(description = "Add an item to the cart")
    public void addOneItemToCart() {

        HomePage.clickRedDuckLink();
        RedDuckPage.clickAddToCartButton();
        RedDuckPage.getItemsQuantity("1");

    }

}
