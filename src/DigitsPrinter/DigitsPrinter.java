package DigitsPrinter;

/**
 * Created by Eugene on 07.02.17.
 */
public class DigitsPrinter {

    public static void main(String[] args) {
        int n = 13579;
        System.out.println(n/10000%10);
        System.out.println(n/1000%10);
        System.out.println(n/100%10);
        System.out.println(n/10%10);
        System.out.println(n%10);

        System.out.println();
        System.out.println();

        int m = 24;
        System.out.println(m/10000%10);
        System.out.println(m/1000%10);
        System.out.println(m/100%10);
        System.out.println(m/10%10);
        System.out.println(m%10);

        System.out.println();
        System.out.println();

        int k = 987654321;
        System.out.println(k/10000%10);
        System.out.println(k/1000%10);
        System.out.println(k/100%10);
        System.out.println(k/10%10);
        System.out.println(k%10);
        }
    }

