package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.*;
import org.testng.Assert;

public class AutomationPracticeSteps extends PageSteps {

    @Given("El usuario ingresa en la web de automation practice")
    public void elUsuarioIngresaEnLaWebDeAutomationPractice() {
        AutomationPracticeService.navegarWeb();
    }

    @When("Ingresa en Shop Menu")
    public void ingresaEnShopMenu() {
        AutomationPracticeService.irAShopMenu();
    }

    @And("Clickea en Home")
    public void clickeaEnHome() {
        AutomationPracticeShopService.clickInHome();
    }

    @Then("Se visualiza el slider")
    public void seVisualizaElSlider() {
        AutomationPracticeShopService.verificarSliderHome();
    }
}
