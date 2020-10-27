package Pages;

import Core.BasePage;
import Core.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Core.DriverFactory.getDriver;

public class MenuPage extends BasePage {

    public void logarNoPortal() {
        DriverFactory.getDriver().get("http://automationpractice.com/index.php?controller=authentication");
        WebDriverWait wait = new WebDriverWait(getDriver(),10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("email")));
        escreverTexto("email", CreateAnAccount.textodaemail);
        System.out.println(CreateAnAccount.textodaemail);
        escreverTexto("passwd", CreateAnAccount.textodasenha);
        System.out.println(CreateAnAccount.textodasenha);
        cliqueBotao("SubmitLogin");
    }

    public void MyAccount(){
        clicarLinkXpath("//a[@title=\"View my customer account\"]");
    }

}
