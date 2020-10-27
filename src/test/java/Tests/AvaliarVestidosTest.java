package Tests;

import Core.BaseTest;
import Pages.*;
import org.junit.Assert;
import org.junit.Test;

public class AvaliarVestidosTest extends BaseTest {
    private MenuPage menuPage = new MenuPage();
    private EveningDressesPage eveningDressesPage = new EveningDressesPage();
    private DressPage dressPage = new DressPage();

    @Test
    public void testAvaliarVestidoRosa(){
        menuPage.logarNoPortal();
        eveningDressesPage.acessarEveningDresses();
        eveningDressesPage.clicarAddCart();
        dressPage.acessarwriteReview();
        dressPage.setStars(".//*[@id=\"criterions_list\"]//div[6]");
        dressPage.setWriteTitle("Avaliação dos vestidos Rosa M e Cinza P");
        dressPage.setWriteComment("Avaliação dos vestidos Rosa M e Cinza P");
        dressPage.buttonSendComment();
        Assert.assertEquals("Your comment has been added and will be available once approved by a moderator",dressPage.obterMensagem());
        dressPage.ok();
    }


}
