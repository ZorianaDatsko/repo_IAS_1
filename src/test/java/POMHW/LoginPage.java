package POMHW;

import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Accessors(fluent = true)
@NoArgsConstructor
@Getter
public class LoginPage {
        public static SelenideElement userNameField = $("#user-name");
        public static SelenideElement passwordField = $("#password");
        public static SelenideElement loginButton = $("#login-button");

        public void open() {
                Selenide.open("https://www.saucedemo.com/");
        }

        public void setLogin(String username) {
                userNameField.setValue(username);
        }

        public void setPassword(String password) {
                passwordField.setValue(password);
        }

        public void clickLoginButton() {
                loginButton.click();
        }
}


