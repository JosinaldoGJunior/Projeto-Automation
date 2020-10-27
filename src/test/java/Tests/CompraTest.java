package Tests;

import Core.BaseTest;
import Pages.*;
import org.junit.Assert;
import org.junit.Test;

public class CompraTest extends BaseTest {

    private MyAccountPage myAccountPage = new MyAccountPage();
    private OrderHistoryPage orderHistoryPage = new OrderHistoryPage();
    private MenuPage menuPage = new MenuPage();
    private EveningDressesPage eveningDressesPage = new EveningDressesPage();
    private DressPage dressPage = new DressPage();
    private SummaryPage summaryPage = new SummaryPage();
    private AddressPage addressPage = new AddressPage();
    private ShippingPage shippingPage = new ShippingPage();
    private FormOfPayPage formOfPayPage = new FormOfPayPage();
    private CheckPayPage checkPayPage = new CheckPayPage();


    @Test
    public void testComprarVestidoRosa(){
        menuPage.logarNoPortal();
        eveningDressesPage.acessarEveningDresses();
        eveningDressesPage.clicarAddCart();
        dressPage.sizeDress("2");
        dressPage.colorDress("color_24");
        dressPage.buttonAddCart();
        dressPage.buttonCheckout();
        summaryPage.buttonProceedCheckout();
        addressPage.buttonProceedAddress();
        shippingPage.termsOfService();
        shippingPage.processCarrier();
        formOfPayPage.formsPayCheck();
        checkPayPage.ConfirmPay();
        Assert.assertEquals("Your order on My Store is complete.",checkPayPage.obterMensagemSucesso());
        menuPage.MyAccount();
        myAccountPage.OrderHistory();
        orderHistoryPage.SelecionarOrder();

        Assert.assertEquals("Printed Dress - Color : Pink, Size : M",orderHistoryPage.obterProduct());
        Assert.assertEquals("1",orderHistoryPage.obterQuantily());
        Assert.assertEquals("$50.99",orderHistoryPage.obterPriceUnit());
        Assert.assertEquals("$50.99",orderHistoryPage.obterPriceTotal());
        Assert.assertEquals("$50.99",orderHistoryPage.itemsTaxExcl());
        Assert.assertEquals("$50.99",orderHistoryPage.itemsTaxIncl());
        Assert.assertEquals("$2.00",orderHistoryPage.shippinAndHandling());
        Assert.assertEquals("$52.99",orderHistoryPage.total());
    }


  @Test
    public void testComprarVestidoCinza(){
        menuPage.logarNoPortal();
        eveningDressesPage.acessarEveningDresses();
        eveningDressesPage.clicarAddCart();
        dressPage.sizeDress("1");
        dressPage.colorDress("color_7");
        dressPage.buttonAddCart();
        dressPage.buttonCheckout();
        summaryPage.buttonProceedCheckout();
        addressPage.buttonProceedAddress();
        shippingPage.termsOfService();
        shippingPage.processCarrier();
        formOfPayPage.formsPayCheck();
        checkPayPage.ConfirmPay();
        Assert.assertEquals("Your order on My Store is complete.",checkPayPage.obterMensagemSucesso());
        menuPage.MyAccount();
        myAccountPage.OrderHistory();
        orderHistoryPage.SelecionarOrder();

        Assert.assertEquals("Printed Dress - Color : Beige, Size : S",orderHistoryPage.obterProduct());
        Assert.assertEquals("1",orderHistoryPage.obterQuantily());
        Assert.assertEquals("$50.99",orderHistoryPage.obterPriceUnit());
        Assert.assertEquals("$50.99",orderHistoryPage.obterPriceTotal());
        Assert.assertEquals("$50.99",orderHistoryPage.itemsTaxExcl());
        Assert.assertEquals("$50.99",orderHistoryPage.itemsTaxIncl());
        Assert.assertEquals("$2.00",orderHistoryPage.shippinAndHandling());
        Assert.assertEquals("$52.99",orderHistoryPage.total());
       }


}
