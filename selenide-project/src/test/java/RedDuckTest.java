import org.testng.annotations.Test;

public class RedDuckTest extends TestBase {

    @Test
    public void addOneItemToCart() {

        HomePage.clickRedDuckLink();
        RedDuckPage.clickAddToCartButton();
        RedDuckPage.getItemsQuantity("1");

    }

}
