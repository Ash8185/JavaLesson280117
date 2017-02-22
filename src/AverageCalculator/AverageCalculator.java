package AverageCalculator;

/**
 * Created by Eugene on 07.02.17.
 */
public class AverageCalculator {
    public static void main(String[] args) {
        int a = 5;
        int b = 9;
        int avg = a/2+b/2+(a%2 + b%2)/2;
        System.out.println("avg = "+avg);
    }
}

