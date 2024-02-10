package SelenideHomeWork;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import config.Browser;

public class TestSearch {

    private final BookSearch BookSearch = new BookSearch();
    private static final String BOOK_NAME = "Маленький принц";

    @BeforeTest
    public void setUpBrowser() {
        Browser.setBrowser();
    }

    @Test
    public void searchBook() {
        BookSearch.open();
        BookSearch.closeDialogModal();
        BookSearch.searchInput.setValue(BOOK_NAME);

        BookSearch.someButton.click();;
        BookSearch.someSecondButton.click();
        BookSearch.checkBookAvailability();
    }
}