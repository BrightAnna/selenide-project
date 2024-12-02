import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.title;
import static org.testng.AssertJUnit.assertEquals;

@Epic("Login functionality implementation")
@Feature("Login")
public class LoginTest extends TestBase {

    @Description("This test attempts to login with correct email and password")
    @Test(description = "Login with correct credentials")
    public void loginWithCorrectCredentials() {

        LoginPage.loginWithCredentials("anyrise@yandex.by", "1234!");
        assertEquals("Online Store | My Store", title());

    }

    @Description("This test attempts to login with wrong email and correct password and verifies error message")
    @Test(description = "Login with wrong email and correct password")
    public void loginWithWrongEmailAndCorrectPassword() {

        LoginPage.loginWithCredentials("annyrise@yandex.by", "1234!");
        LoginPage.validateMessageIsDisplayed();
        LoginPage.validateErrorMessageText("Wrong password or the account is disabled, or does not exist");

    }

    @Description("This test attempts to login with correct email and incorrect password and verifies error message")
    @Test(description = "Login with correct email and incorrect password")
    public void loginWithCorrectEmailAndWrongPassword() {

        LoginPage.loginWithCredentials("anyrise@yandex.by", "jkljkl");
        LoginPage.validateMessageIsDisplayed();
        LoginPage.validateErrorMessageText("Wrong password is disabled");

    }
}