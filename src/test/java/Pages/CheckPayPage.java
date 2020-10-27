package Pages;

import Core.BasePage;
import org.openqa.selenium.By;

public class CheckPayPage extends BasePage {

    public void ConfirmPay(){
        clicarLinkXpath("//button[@type=\"submit\"]/span[contains(text(), \"I confirm my order\")]");
    }
    public String obterMensagemSucesso(){
        return obterTexto(By.xpath("//p[contains(text(), \"Your order on My Store is complete.\")]"));
    }

}
