package mv.first;

import com.github.javafaker.Faker;

public class BeerFavorite {

    public static void main(String[] args) {
        System.out.println(Faker.instance().beer().name());
    }
}
