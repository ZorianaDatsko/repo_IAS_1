package sixthHomeWork;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
            try {
                new Main();
                test();
            } catch (IOException e) {

                System.out.println("Log " + e.getMessage());
            }
    }


        public static void test() throws IOException {
            BufferedReader reader = new BufferedReader(new FileReader("non_existent_file.txt"));

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
}


