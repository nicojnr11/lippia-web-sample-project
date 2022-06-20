package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import com.crowdar.driver.DriverManager;
import lippia.web.constants.AutomationPracticeLoginConstants;
import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.*;
import org.testng.Assert;

import java.sql.DriverAction;


public class AutomationPracticeLoginService extends ActionManager {
    public static void setEmailyPassword(String email, String password) {
        setInput(AutomationPracticeLoginConstants.INPUT_USER_EMAIL_ID,email);
        setInput(AutomationPracticeLoginConstants.INPUT_USER_PASSWORD_ID,password);
    }

    public static void clickLogin() {
        click(AutomationPracticeLoginConstants.BUTTON_LOGIN_XPATH);
    }

    public static void verificarMensajeError(String msg) {
        String mensaje = getText(AutomationPracticeLoginConstants.MESSAGE_LIST_ERROR_XPATH);
        Assert.assertTrue(mensaje.contains(msg));
    }

    public static void setEmail(String email) {
        setInput(AutomationPracticeLoginConstants.INPUT_USER_EMAIL_ID,email);
    }

    public static void setPassword(String pass) {
        setInput(AutomationPracticeLoginConstants.INPUT_USER_PASSWORD_ID,pass);
    }

    public static void setRegister(String email, String password) {
        String emailRandom = RandomStringUtils.randomAlphabetic(6);
        setInput(AutomationPracticeLoginConstants.INPUT_REGISTER_EMAIL_ID,emailRandom+email);
        setInput(AutomationPracticeLoginConstants.INPUT_REGISTER_PASSWORD_ID,password);
    }

    public static void clickRegister() {
        waitClickable(AutomationPracticeLoginConstants.BUTTON_REGISTER_XPATH);
        click(AutomationPracticeLoginConstants.BUTTON_REGISTER_XPATH);
    }

    public static void setRegisterPassword(String password) {
        setInput(AutomationPracticeLoginConstants.INPUT_REGISTER_PASSWORD_ID,password);
    }

    public static void setRegisterEmail(String email) {
        String emailRandom = RandomStringUtils.randomAlphabetic(6);
        setInput(AutomationPracticeLoginConstants.INPUT_REGISTER_EMAIL_ID,emailRandom+email);
    }
}
