package secondHomeWork;

public class CurrencyConverter {
    private double commission;
    private double exchangeRate;

    public CurrencyConverter(double commission, double exchangeRate) {
        this.commission = commission;
        this.exchangeRate = exchangeRate;
    }

    private double convertUsdToUah(double usdAmount) {
        return usdAmount * exchangeRate;
    }

    private double calculateCommission(double amountUah) {
        return (amountUah * commission) / 100;
    }

    public double calculateTotalAmount(double usdAmount) {
      double totalAmount = convertUsdToUah(usdAmount);
      double totalCommission = calculateCommission(totalAmount);
      return totalAmount - totalCommission;
    }
}
