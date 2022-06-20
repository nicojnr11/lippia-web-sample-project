package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.AutomationPracticeMyAccountDashboardConstants;
import org.testng.Assert;

public class AutomationPracticeDashboardService extends ActionManager {
    public static void verificarDashboardUser() {
        Assert.assertTrue(isVisible(AutomationPracticeMyAccountDashboardConstants.BUTTON_DASHBOARD_XPATH));
        Assert.assertTrue(isVisible(AutomationPracticeMyAccountDashboardConstants.BUTTON_DOWNLOADS_XPATH));
        Assert.assertTrue(isVisible(AutomationPracticeMyAccountDashboardConstants.BUTTON_ADDRESSES_XPATH));
        Assert.assertTrue(isVisible(AutomationPracticeMyAccountDashboardConstants.BUTTON_ORDERS_XPATH));
        Assert.assertTrue(isVisible(AutomationPracticeMyAccountDashboardConstants.BUTTON_LOGOUT_XPATH));
    }
}
