package lippia.web.services;

import lippia.web.constants.MyAccountPageConstants;
import org.testng.Assert;

import static com.crowdar.core.actions.ActionManager.*;

public class MyAccountService  {

    public static void logOut() {
        waitVisibility(MyAccountPageConstants.BUTTON_LOGOUT_XPATH);
        click(MyAccountPageConstants.BUTTON_LOGOUT_XPATH);
    }

    public static void clickAccountDetails() {
        waitVisibility(MyAccountPageConstants.BUTTON_ACCOUNT_DETAILS_XPATH);
        click(MyAccountPageConstants.BUTTON_ACCOUNT_DETAILS_XPATH);
    }

    public static void verificarDetalles() {
        Assert.assertTrue(isVisible(MyAccountPageConstants.INPUT_FIRST_NAME_XPATH));
        Assert.assertTrue(isVisible(MyAccountPageConstants.INPUT_LAST_NAME_XPATH));
        Assert.assertTrue(isVisible(MyAccountPageConstants.LEGEND_PASSWORD_XPATH));
    }
}
