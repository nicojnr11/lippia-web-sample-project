package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.AutomationPracticeLoginService;
import lippia.web.services.AutomationPracticeService;
import lippia.web.services.AutomationPracticeShopService;

public class LoginSteps extends PageSteps {

    @Given("The user naviga to in the page automation")
    public void elUsuarioIngresaEnLaWebDeAutomationPractice() {
        AutomationPracticeService.navegarWeb();
    }

    @Given("Click on My Account Menu")
    public void clickOnMyAccountMenu() {
        AutomationPracticeService.irAMyAccount();
    }

    @When("Enter the case changed (.*) in username textbox")
    public void enterTheCaseChangedUsernameInUsernameTextbox(String userName) {
        AutomationPracticeLoginService.setEmail(userName);
    }

    @And("Enter the case chenged (.*) in the password tetxbox")
    public void enterTheCaseChengedPasswordInThePasswordTetxbox(String password) {
        AutomationPracticeLoginService.setPassword(password);
    }

    @And("Now click on login button")
    public void nowClickOnLoginButton() {
        AutomationPracticeLoginService.clickLogin();
    }

    @Then("Login must fail saying incorrect username-password with show (.*)")
    public void loginMustFailSayingIncorrectUsernamePasswordWithShowMessage(String message) {
        AutomationPracticeLoginService.verificarMensajeError(message);
    }

    @And("Once your are logged in, sign out of the site")
    public void onceYourAreLoggedInSignOutOfTheSite() {
        AutomationPracticeLoginService.singOut();
    }


    @And("Now press back button")
    public void nowPressBackButton() {
        AutomationPracticeLoginService.gotoBack();
    }

    @Then("User shouldn’t be signed in to his account rather a general webpage must be visible")
    public void userShouldnTBeSignedInToHisAccountRatherAGeneralWebpageMustBeVisible() {
        AutomationPracticeLoginService.verifyPageLogin();
    }
}
