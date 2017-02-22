package DateCalculator;

/**
 * Created by Eugene on 07.02.17.
 */

public class DateCalculator {
    public static void main(String[] args) {

        int days = 360;
        int year = ((days-1)/360+1);
        int month = ((days-1)%360)/30+1;
        int day = (days-1)%30+1;

        System.out.println("year = " + year);
        System.out.println("month = " + month);
        System.out.println("day = " + day);
    }
}
