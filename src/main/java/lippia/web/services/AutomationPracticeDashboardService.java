package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.MyAccountPageConstants;
import org.testng.Assert;

public class AutomationPracticeDashboardService extends ActionManager {
    public static void verificarDashboardUser() {
        Assert.assertTrue(isVisible(MyAccountPageConstants.BUTTON_DASHBOARD_XPATH));
        Assert.assertTrue(isVisible(MyAccountPageConstants.BUTTON_DOWNLOADS_XPATH));
        Assert.assertTrue(isVisible(MyAccountPageConstants.BUTTON_ADDRESSES_XPATH));
        Assert.assertTrue(isVisible(MyAccountPageConstants.BUTTON_ORDERS_XPATH));
        Assert.assertTrue(isVisible(MyAccountPageConstants.BUTTON_LOGOUT_XPATH));
    }
}
