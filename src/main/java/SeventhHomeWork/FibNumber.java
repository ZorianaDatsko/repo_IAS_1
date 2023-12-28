package SeventhHomeWork;
import java.util.stream.Stream;

public class FibNumber {

    public static void main(String[] args) {
        int n = 9;

    int result = Stream.iterate(new int[]{0, 1}, fib -> new int[]{fib[1], fib[0] + fib[1]})
                .limit(n)
                .reduce((first, second) -> second)
                .orElseThrow()[0];

    System.out.println(result);
    }
}