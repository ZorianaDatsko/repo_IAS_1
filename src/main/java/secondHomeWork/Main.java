package secondHomeWork;

public class Main {
        public static void main(String[] args) {

            CurrencyConverter converter = new CurrencyConverter(1.0, 36.55);

            double usdAmount = 100.0;

            double amountForClient = converter.calculateTotalAmount(usdAmount);

            System.out.println(amountForClient);
        }
}
