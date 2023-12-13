package fourhHomeWork;

public class Fraction {
    private int numerator;
    private int denominator;

    private Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    @Override
    public boolean equals(Object o) {
        Fraction fraction = (Fraction) o;

        double result1 = (double) numerator / denominator;
        double result2 = (double) fraction.numerator / fraction.denominator;

        return result1 == result2;
    }

    public static void main(String[] args) {
        Fraction fraction1 = new Fraction(2,4);
        Fraction fraction2 = new Fraction(4, 8);

        System.out.println(fraction1.equals(fraction2));
    }

}
