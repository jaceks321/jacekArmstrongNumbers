package armstrongnumbers;

import java.util.ArrayList;
import java.util.List;

public class ArmstrongNumbers {
    public static boolean isArmstrongNumber(int number) {
        List<Integer> digits = new ArrayList<Integer>();
        while (number > 0) {
            digits.add(number%10);
            number/=10;
        }
        double armstrongNumber = 0;
        for (int i = 0; i <= digits.size() - 1; i++) {
            double a;
            a = (int)Math.pow(digits.get(i), digits.size());
            armstrongNumber =+ a;
        }
        if(armstrongNumber == number) {
            return true;
        } else
            return false;
    }

}
