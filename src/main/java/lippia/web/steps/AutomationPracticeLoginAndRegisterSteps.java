package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.AutomationPracticeDashboardService;
import lippia.web.services.LoginService;
import lippia.web.services.AutomationPracticeService;

public class AutomationPracticeLoginAndRegisterSteps extends PageSteps {

    @When("^Ingresa en la pagina de login e ingresa el email (.*) y la pass (.*)$")
    public void ingresaEnLaPaginaDeLoginEIngresaElEmailAutomationEmailComYLaPassAutomati(String email, String password) {
        //AutomationPracticeService.irAMyAccount();
        LoginService.setEmailyPassword(email, password);
        LoginService.clickLogin();
    }

    @Then("^Se visualiza el dashboard de usuario$")
    public void seVisualizaElDashboardDeUsuario() {
        AutomationPracticeDashboardService.verificarDashboardUser();
    }

    @Then("^Se visualiza el mensaje de error (.*)$")
    public void seVisualizaElMensajeDeError(String msg) {
        LoginService.verificarMensajeError(msg);
    }

    @When("^Ingresa en la pagina de login e ingresa solo el email (.*)$")
    public void ingresaEnLaPaginaDeLoginEIngresaElEmailAutomationEmailCom(String email) {
        //AutomationPracticeService.irAMyAccount();
        LoginService.setEmail(email);
        LoginService.clickLogin();
    }

    @When("^Ingresa en la pagina de login e ingresa la pass (.*)$")
    public void ingresaEnLaPaginaDeLoginEIngresaLaPassTestingCrowdar(String pass) {
        //AutomationPracticeService.irAMyAccount();
        LoginService.setPassword(pass);
        LoginService.clickLogin();
    }

    @When("Ingresa en la pagina de login e ingresa los datos vacios")
    public void ingresaEnLaPaginaDeLoginEIngresaLosDatosVacios() {
        //AutomationPracticeService.irAMyAccount();
        LoginService.clickLogin();
    }

    @When("^Ingresa en la pagina de register e ingresa el email (.*) y la pass (.*)$")
    public void ingresaEnLaPaginaDeRegisterEIngresaElEmailAutomationEmailComYLaPassTestingCrowdar(String email, String password) {
        //AutomationPracticeService.irAMyAccount();
        LoginService.setRegister(email,password);
        LoginService.clickRegister();
    }

    @When("^Ingresa en la pagina de register e ingresa la pass (.*)$")
    public void ingresaEnLaPaginaDeRegisterEIngresaLaPassTestingCrowdar(String password) {
        //AutomationPracticeService.irAMyAccount();
        LoginService.setRegisterPassword(password);
        LoginService.clickRegister();
    }

    @When("^Ingresa en la pagina de register e ingresa solo el email (.*)$")
    public void ingresaEnLaPaginaDeRegisterEIngresaSoloElEmailAutomationEmailCom(String email) {
        //AutomationPracticeService.irAMyAccount();
        LoginService.setRegisterEmail(email);
        LoginService.clickRegister();
    }

    @When("Ingresa en la pagina de Register e ingresa los datos vacios")
    public void ingresaEnLaPaginaDeRegisterEIngresaLosDatosVacios() {
        //AutomationPracticeService.irAMyAccount();
        LoginService.clickRegister();
    }
}
