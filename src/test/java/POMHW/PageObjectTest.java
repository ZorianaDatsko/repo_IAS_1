package POMHW;

import com.codeborne.selenide.Condition;
import config.Browser;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static POMHW.CheckoutPage.summary_tax_label;

public class PageObjectTest {

    private final LoginPage loginPage = new LoginPage();
    private final ProductPage productPage = new ProductPage();
    private final CartPage cartPage = new CartPage();
    private final CheckoutPage checkoutPage = new CheckoutPage();
    private final FinishPage finishPage = new FinishPage();

    @BeforeTest
    public void setUpBrowser() {
        Browser.setBrowser();
    }

    @Test
    public void valid() {
        loginPage.open();
        loginPage.setLogin("standard_user");
        loginPage.setPassword("secret_sauce");
        loginPage.clickLoginButton();
        productPage.addToCartByPrice(7.99);
        productPage.addToCartByPrice(9.99);
        productPage.clickCartIcon();
        CartPage.backpackCartItem.should(Condition.exist);
        CartPage.bikeLightCartItem.should(Condition.exist);
        cartPage.clickCheckoutButton();
        checkoutPage.setFirstName("Petro");
        checkoutPage.setLastName("Poroshenko");
        checkoutPage.setZipCode(90774);
        checkoutPage.clickContinueButton();
        checkoutPage.printTaxValue(summary_tax_label);
        checkoutPage.clickFinishButton();;
        Assert.assertTrue(FinishPage.header.getText().contains("Thank you for your order!"));
    }
}
