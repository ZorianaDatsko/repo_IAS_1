package POMHW;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Accessors(fluent = true)
@NoArgsConstructor
@Getter
public class CartPage {

    public static SelenideElement backpackCartItem = $(byXpath("//div[@class='inventory_item_name' and contains(text(),'Sauce Labs Onesie')]"));
    public static SelenideElement bikeLightCartItem = $(byXpath("//div[@class='inventory_item_name' and contains(text(),'Sauce Labs Bike Light')]"));
    public static SelenideElement checkoutButton = $("#checkout");
    public void openCartPage() {
        open("https://www.saucedemo.com/cart.html");
    }

    public void clickCheckoutButton() {
        checkoutButton.click();
    }
}
