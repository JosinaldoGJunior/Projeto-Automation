package Pages;

import Core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Core.DriverFactory.getDriver;

public class OrderHistoryPage extends BasePage {

    public void SelecionarOrder(){
        clicarLinkXpath("//table[@id=\"order-list\"]/tbody/tr/td[7]/a/span[contains(text(), \"Details\")]");
    }
    public String obterProduct(){
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[2]/label")));
        return obterTexto(By.xpath("//td[2]/label"));
    }
    public String obterQuantily(){
        return obterTexto(By.xpath("//td[3]/label"));
    }
    public String obterPriceUnit(){
        return obterTexto(By.xpath("//td[4]/label"));
    }

    public String obterPriceTotal(){
        return obterTexto(By.xpath("//td[5]/label"));
    }

    public String itemsTaxExcl	(){
        return obterTexto(By.xpath("//tfoot/tr[1]/td[2]"));
    }

    public String itemsTaxIncl(){
        return obterTexto(By.xpath("//tfoot/tr[2]/td[2]"));
    }

    public String shippinAndHandling (){
        return obterTexto(By.xpath("//tfoot/tr[3]/td[2]"));
    }

    public String total(){
        return obterTexto(By.xpath("//tfoot/tr[4]/td[2]"));
    }
}
