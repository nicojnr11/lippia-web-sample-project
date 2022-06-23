package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.LoginService;
import lippia.web.services.AutomationPracticeService;

public class LoginSteps extends PageSteps {

    @Given("El usuario navega en la pagina automation")
    public void elUsuarioIngresaEnLaWebDeAutomationPractice() {
        AutomationPracticeService.navegarWeb();
    }

    @When("El usuario completa el campo user con (.*)")
    public void elUsuarioCompletaElCampoUserConUsername(String userName) {
        LoginService.setEmail(userName);
    }

    @And("El usuario completa el campo password con (.*)")
    public void elUsuarioCompletaElCampoPasswordConPassword(String password) {
        LoginService.setPassword(password);
    }

    @And("El usuario realiza un click en el boton de Login")
    public void elUsuarioRealizaUnClickEnElBotonDeLogin() {
        LoginService.clickLogin();
    }

    @Then("se verifica que esta en la pantalla principal")
    public void seVerificaQueEstaEnLaPantallaPrincipal() {
        LoginService.verifyPageLogin();
    }

    @When("El usuario completa el campo email con (.*) en Email-Address")
    public void enterValidEmailAddressInEmailAddressTextbox(String email) {
        LoginService.setEmail(email);
    }

    @And("El usuario no ingresa datos en el campo Password")
    public void enterEmptyPasswordInPasswordTextbox() {
        LoginService.verifyTextboxPassword();
    }

    @And("El usuario realiza un click en el boton Register")
    public void clickOnRegisterButton() {
        LoginService.clickRegister();
    }

    @When("Enter empty Email Address in Email-Address textbox")
    public void enterEmptyEmailAddressInEmailAddressTextbox() {
        LoginService.verifyTextboxEmail();
    }

    @Then("se muestra el mensaje de error (.*)")
    public void registrationMustFailWithAWarningMessageMessage(String msg) {
        LoginService.verificarMensajeError(msg);
    }

    @When("El usuario no completa los campos email y password y realiza un click en Register")
    public void elUsuarioNoCompletaLosCamposEmailYPasswordYRealizaUnClickEnRegister() {
        LoginService.clickRegister();
    }
}
