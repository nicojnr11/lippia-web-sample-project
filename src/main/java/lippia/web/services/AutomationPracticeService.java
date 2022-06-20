package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.AutomationPracticeConstants;

import static com.crowdar.core.actions.WebActionManager.navigateTo;


public class AutomationPracticeService extends ActionManager {

    public static void navegarWeb(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void irAShopMenu() {
        click(AutomationPracticeConstants.BUTTON_SHOP_MENU_ID);
    }

    public static void irAMyAccount() { click(AutomationPracticeConstants.BUTTON_MY_ACCOUNT_XPATH); }

}
