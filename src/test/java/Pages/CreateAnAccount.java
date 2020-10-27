package Pages;

import Core.BasePage;
import Core.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static Core.DriverFactory.getDriver;
import org.apache.commons.lang3.RandomStringUtils;


public class CreateAnAccount extends BasePage {


    public void acessarTelaInicial(){
        DriverFactory.getDriver().get("http://automationpractice.com/index.php?controller=authentication");
    }
    static String textodaemail = "";

    public void setEmailParaCadastro() {
        String email = ("jgsj"+RandomStringUtils.randomAlphabetic (3)+"@orbia.ag");
        escreverTexto("email_create",email);
        textodaemail = email;
        System.out.println(email);
    }



    public void setBotaoCreate() {
        cliqueBotao("SubmitCreate");
    }

    public void setRadioMr() {
        WebDriverWait wait = new WebDriverWait(getDriver(),10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("id_gender1")));
        cliqueRadio("id_gender1");
    }

    public void setFistNameClient(String fistname) {
        escreverTexto("customer_firstname", fistname);

    }

    public void setLastNameClient(String lastmame) {
        escreverTexto("customer_lastname",lastmame);

    }



    static String textodasenha = "";

    public void setPasswd(){

        String senha = RandomStringUtils.randomAlphanumeric (5);
        escreverTexto("passwd",senha);
        textodasenha=senha;
        System.out.println(senha);

    }



    public void setDataOfBirthDay(String day) {
        selecionarCombo("days", day);
    }
    public void setDataOfBirthMonths( String months) {
        selecionarCombo("months", months);
    }

    public void setDataOfBirthYears(String years) {
        selecionarCombo("years", years);
    }

    public void setNewsLetter(){
        cliqueRadio("newsletter");
    }

    public void setReceiveSpecial(){
        cliqueRadio("optin");
    }

    public void setAddressFirstName(String firstName){
        escreverTexto("firstname",firstName);
    }

    public void setAddressLastName(String lastname){
        escreverTexto("lastname",lastname);
    }

    public void setAddressCompany(String company){
        escreverTexto("company",company);
    }

    public void setAddress(String address){
        escreverTexto("address1",address);
    }

    public void setAddressLine2(String addressLine2){
        escreverTexto("address2",addressLine2);
    }

    public void setCity(String city){
        escreverTexto("city",city);
    }

    public void setState(String state){
        selecionarCombo("id_state",state);
    }

    public void setPostalCode(String code){
        escreverTexto("postcode",code);
    }

    public void setAdditionalInformation(String information){
        escreverTexto("other",information);
    }

    public void setHomePhone(String homePhone){
        escreverTexto("phone",homePhone);
    }

    public void setMobilePhone(String mobilephone){
        escreverTexto("phone_mobile",mobilephone);
    }

    public void setAlias(String alias){
        escreverTexto("alias",alias);
    }

    public void setButtonRegister(){
        cliqueBotao("submitAccount");

    }




}
