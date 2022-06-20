package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.ShopPageConstants;
import org.testng.Assert;
import static lippia.web.constants.ShopPageConstants.SLIDER_HOME_ID;


public class AutomationPracticeShopService extends ActionManager {

    public static void clickInHome() {
        click(ShopPageConstants.BUTTON_HOME_XPATH);
    }

    public static void verificarSliderHome() {
        Assert.assertTrue(isVisible(SLIDER_HOME_ID));
    }

}
