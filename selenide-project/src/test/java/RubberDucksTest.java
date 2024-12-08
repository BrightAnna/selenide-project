import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

@Epic("Catalog functionality implementation")
@Feature("Sorting")
public class RubberDucksTest extends TestBase {

    @Description("When user clicks the button 'Name' products are sorted by name")
    @Test(description = "Sorting Ducks by Name")
    public void sortingDucksByName() {

        HomePage.clickRubberDucksLink();
        RubberDucksPage.clickButtonName();
        RubberDucksPage.validateActiveButtonName("Name");

    }

}