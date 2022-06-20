package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.LoginPageConstants;
import org.apache.commons.lang.RandomStringUtils;
import org.testng.Assert;


public class AutomationPracticeLoginService extends ActionManager {
    public static void setEmailyPassword(String email, String password) {
        setInput(LoginPageConstants.INPUT_USER_EMAIL_ID,email);
        setInput(LoginPageConstants.INPUT_USER_PASSWORD_ID,password);
    }

    public static void clickLogin() {
        click(LoginPageConstants.BUTTON_LOGIN_XPATH);
    }

    public static void verificarMensajeError(String msg) {
        String mensaje = getText(LoginPageConstants.MESSAGE_LIST_ERROR_XPATH);
        Assert.assertTrue(mensaje.contains(msg));
    }

    public static void setEmail(String email) {
        setInput(LoginPageConstants.INPUT_USER_EMAIL_ID,email);
    }

    public static void setPassword(String pass) {
        setInput(LoginPageConstants.INPUT_USER_PASSWORD_ID,pass);
    }

    public static void setRegister(String email, String password) {
        String emailRandom = RandomStringUtils.randomAlphabetic(6);
        setInput(LoginPageConstants.INPUT_REGISTER_EMAIL_ID,emailRandom+email);
        setInput(LoginPageConstants.INPUT_REGISTER_PASSWORD_ID,password);
    }

    public static void clickRegister() {
        waitClickable(LoginPageConstants.BUTTON_REGISTER_XPATH);
        click(LoginPageConstants.BUTTON_REGISTER_XPATH);
    }

    public static void setRegisterPassword(String password) {
        setInput(LoginPageConstants.INPUT_REGISTER_PASSWORD_ID,password);
    }

    public static void setRegisterEmail(String email) {
        String emailRandom = RandomStringUtils.randomAlphabetic(6);
        setInput(LoginPageConstants.INPUT_REGISTER_EMAIL_ID,emailRandom+email);
    }

    public static void singOut() {
    }

    public static void gotoBack() {
    }

    public static void verifyPageLogin() {
    }
}
