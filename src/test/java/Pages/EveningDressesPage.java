package Pages;

import Core.BasePage;

public class EveningDressesPage extends BasePage {

    public void acessarEveningDresses(){
        mouseOver("//*[@id=\"block_top_menu\"]/ul/li[1]");
        clicarLinkXpath("//*[@id=\"block_top_menu\"]/ul/li[1]//a[contains(text(), \"Evening Dresses\")]");
    }

    public void clicarAddCart(){
         clicarLinkXpath("//a[contains(text(),'Printed Dress')]");

    }





}
