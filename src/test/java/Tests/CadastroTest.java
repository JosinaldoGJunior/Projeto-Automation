package Tests;

import Core.BaseTest;
import Pages.CreateAnAccount;
import org.junit.Test;


public class CadastroTest extends BaseTest {
   private CreateAnAccount createAnAccount =new CreateAnAccount();

    @Test
    public void testCadastro(){
    createAnAccount.acessarTelaInicial();
    createAnAccount.setEmailParaCadastro();
    createAnAccount.setBotaoCreate();
    createAnAccount.setRadioMr();
    createAnAccount.setFistNameClient("Josinaldo");
    createAnAccount.setLastNameClient("Junior");
    createAnAccount.setPasswd();
    createAnAccount.setDataOfBirthDay("10");
    createAnAccount.setDataOfBirthMonths("2");
    createAnAccount.setDataOfBirthYears("1996");
    createAnAccount.setNewsLetter();
    createAnAccount.setReceiveSpecial();
    createAnAccount.setAddressFirstName("Av. Alexandria");
    createAnAccount.setAddressLastName("Cunha");
    createAnAccount.setAddressCompany("Orbia");
    createAnAccount.setAddress("Avenida das Nações Unidas");
    createAnAccount.setAddressLine2("Apartment");
    createAnAccount.setCity("Alexandria");
    createAnAccount.setState("18");
    createAnAccount.setPostalCode("71301");
    createAnAccount.setAdditionalInformation("+13184878976");
    createAnAccount.setHomePhone("+1144556655");
    createAnAccount.setMobilePhone("+1122558877");
    createAnAccount.setAlias("My Home");
    createAnAccount.setButtonRegister();
    }

}
