package Core;

import org.openqa.selenium.By;
import static Core.DriverFactory.getDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BasePage {


      /********* DSL para Escrever e obter Textos ************/
    public void escreverTexto(By by, String texto){
        getDriver().findElement(by).clear();
        getDriver().findElement(by).sendKeys(texto);
    }

    public void escreverTexto(String id_Texto, String texto){
        escreverTexto((By.id(id_Texto)),texto);
    }

        public String obterTexto(By by) {
        return getDriver().findElement(by).getText();
    }

    /********* Botao ************/
    public void cliqueBotao(String id_Botao){
        getDriver().findElement(By.id(id_Botao)).click();
    }


    /********* Radio **********/
    public void cliqueRadio(String id_Radio){
        getDriver().findElement(By.id(id_Radio)).click();
    }

    /********* Combo **********/
    public void selecionarCombo(String id, String valor) {
        WebElement element = getDriver().findElement(By.id(id));
        Select combo = new Select(element);
        combo.selectByValue(valor);
    }

    /********* Link **********/
    public void clicarLink(String link) {
        getDriver().findElement(By.linkText(link)).click();
    }

    public void clicarLinkXpath(String xpath){
        getDriver().findElement(By.xpath(xpath)).click();

    }

    /******** mouse over *******/
    public void mouseOver(String id_over) {
        Actions acao = new Actions(getDriver());
        WebElement menu = getDriver().findElement(By.xpath(id_over));
        acao.moveToElement(menu).perform();

    }






}