package Pages;

import Core.BasePage;

public class AddressPage extends BasePage {

    public void buttonProceedAddress(){

        clicarLinkXpath("//button[@type=\"submit\"]/span[contains(text(), \"Proceed to checkout\")]");

    }
}
