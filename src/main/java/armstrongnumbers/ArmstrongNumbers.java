package armstrongnumbers;

import java.util.ArrayList;
import java.util.List;

public class ArmstrongNumbers {
    public static boolean isArmstrongNumber(int number) {
        int tempnumber = number;
        List<Integer> digits = new ArrayList<>();
        while (number > 0) {
            digits.add(number%10);
            number/=10;
        }
        double armstrongNumber = 0;
        for(int i:digits) {
            double a;
            a = (int)Math.pow(i, digits.size());
            armstrongNumber += a;
        }
        System.out.println(armstrongNumber);

        if(armstrongNumber == tempnumber) {
            return true;
        } else
            return false;
    }

}
