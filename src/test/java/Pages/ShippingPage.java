package Pages;

import Core.BasePage;

public class ShippingPage extends BasePage {

    public void termsOfService(){
        cliqueRadio("cgv");

    }

    public void processCarrier(){
    clicarLinkXpath("//button[@type=\"submit\"]/span[contains(text(), \"Proceed to checkout\")]");

    }

}
