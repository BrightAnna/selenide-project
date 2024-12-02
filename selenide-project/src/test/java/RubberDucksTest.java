import org.testng.annotations.Test;

public class RubberDucksTest extends TestBase {

    @Test
    public void sortingDucksByName() {

        HomePage.clickRubberDucksLink();
        RubberDucksPage.clickButtonName();
        RubberDucksPage.validateActiveButtonName("Name");

    }

}