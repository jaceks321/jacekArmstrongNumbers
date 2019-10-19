package armstrongnumbers;

import java.util.ArrayList;
import java.util.List;

public class soutclass {
    public static void main(String[] args) {
        int number = 1890;
        List<Integer> digits = new ArrayList<Integer>();
        while (number > 0) {
            digits.add(number%10);
            number/=10;
        }
        System.out.println(digits);

        double armstrongNumber = 0;
        for(int i:digits) {
            double a;
            a = (int)Math.pow(i, digits.size());
            armstrongNumber += a;
        }
        System.out.println(armstrongNumber);
    }
}
