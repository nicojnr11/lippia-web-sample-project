package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.constants.MyAccountPageConstants;
import lippia.web.services.AutomationPracticeService;
import lippia.web.services.MyAccountService;


public class MyAccountSteps extends PageSteps {



    @When("El usuario realiza un click en My Account Menu")
    public void elUsuarioRealizaUnClickEnMyAccountMenu() {
        AutomationPracticeService.irAMyAccount();
    }

    @And("El usuario realiza un logout")
    public void elUsuarioRealizaUnLogout() {
        MyAccountService.logOut();
    }

    @Given("El usuario realiza un click en la opcion Account Details")
    public void elUsuarioRealizaUnClickEnLaOpcionAccountDetails() {
        MyAccountService.clickAccountDetails();
    }

    @Then("El usuario visualiza los detalles de la cuenta")
    public void elUsuarioVisualizaLosDetallesDeLaCuenta() {
        MyAccountService.verificarDetalles();
    }
}
