import org.testng.annotations.Test;

public class ExeptionTest {

    @Test
    public void myTestWithError(){
        throw new AssertionError("Exception in test method");
    }

}