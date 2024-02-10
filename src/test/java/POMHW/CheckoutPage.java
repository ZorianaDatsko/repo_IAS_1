package POMHW;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import static com.codeborne.selenide.Selenide.$;

    @Accessors(fluent = true)
    @NoArgsConstructor
    @Getter
    public class CheckoutPage {
        public static SelenideElement firstNameField = $("#first-name");
        public static SelenideElement lastNameField = $("#last-name");
        public static SelenideElement zipCodeField = $("#postal-code");
        public static SelenideElement continueButton = $("#continue");
        public static SelenideElement summary_tax_label = $x("//div[@class='summary_tax_label']");
        public static SelenideElement finishButton = $("#finish");

        public void open() {
            Selenide.open("https://www.saucedemo.com/checkout-step-one.html");
        }

        public void setFirstName(String firstname) {
            firstNameField.setValue(firstname);
        }

        public void setLastName(String lastname) {
            lastNameField .setValue(lastname);
        }

        public void setZipCode(int zipcode) {
            zipCodeField.setValue(String.valueOf(zipcode));
        }

        public void clickContinueButton() {
            continueButton.click();
        }
        public void clickFinishButton() {
            finishButton.click();
        }

        public void printTaxValue(SelenideElement summary_tax_label) {
            String taxValue = summary_tax_label.getText().replace("Tax: $", "").trim();
            System.out.println("$" + taxValue);
        }
    }
