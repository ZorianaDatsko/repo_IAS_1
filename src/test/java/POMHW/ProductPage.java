package POMHW;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;
public class ProductPage {

    public static SelenideElement cartBadge = $(".shopping_cart_badge");
    public static ElementsCollection products = $$(".inventory_item_price");
    public static ElementsCollection inventoryItems = $$(".inventory_item");
    public static SelenideElement cartIcon = $(".shopping_cart_link");
    public void openPage() {
        open("https://www.saucedemo.com/inventory.html");
    }

    public void addToCartByPrice(double price) {
        for (SelenideElement product : products) {
            if (product.text().equals("$" + price)) {
                inventoryItems.find(Condition.text("$" + price))
                        .$(".btn_inventory").click();
                break;
            }
        }
    }

    public int getCartItemCount() {
        return Integer.parseInt(cartBadge.getText());
    }

    public void clickCartIcon() {
        cartIcon.click();
    }
}

