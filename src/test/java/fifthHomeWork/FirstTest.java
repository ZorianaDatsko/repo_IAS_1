package fifthHomeWork;

import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import config.Browser;
public class FirstTest {

    @BeforeTest
    public void setUpBrowser() {
        Browser.setBrowser();
    }
    @Test
    public void test1() {
        Selenide.open("https://www.google.com");
    }
}
