package fifthHomeWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
            Request<Data> request = new Request<>(10, 100, 20);

            List<Data> list = new ArrayList<>();
            list.add(new Data("Alex", "Male", 26));
            list.add(new Data("Emily", "Female", 20));
            list.add(new Data("Sevyryn", "Male", 31));

            request.putContent(list);

            Collections.sort(list);
            list.forEach(System.out::println);

            System.out.println("Limit: " + request.getLimit());
            System.out.println("Offset: " + request.getOffset());
            System.out.println("Total: " + request.getTotal());

    }
}
