package Pages;

import Core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Core.DriverFactory.getDriver;
public class DressPage extends BasePage {

    public void sizeDress(String size) {
        selecionarCombo("group_1", size);

    }

    public void colorDress(String size) {
        cliqueBotao(size);

    }


    public void buttonAddCart() {
        cliqueBotao("add_to_cart");
    }

    public void buttonCheckout() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("layer_cart")));
        clicarLinkXpath("//div[@id='layer_cart']/div/div[2]/div[4]/a/span");

    }

    public void acessarwriteReview() {
        clicarLink("Write a review");
    }

    public void setWriteTitle(String texto_title) {
        escreverTexto("comment_title", texto_title);
    }

    public void setWriteComment(String texto_comment) {
        escreverTexto("content", texto_comment);
    }

    public void buttonSendComment() {
        cliqueBotao("submitNewMessage");
    }

    public void setStars(String stars) {
        clicarLinkXpath(stars);
    }


    public String obterMensagem() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body[@id='product']/div[2]//div//p[contains(text(), \"Your comment has been added and will be available once approved by a moderator\")]")));
        return obterTexto(By.xpath("//body[@id='product']/div[2]//div//p[contains(text(), \"Your comment has been added and will be available once approved by a moderator\")]"));
    }
    public void ok() {
        clicarLinkXpath("//body[@id='product']/div[2]//div//p/button");
    }



}
