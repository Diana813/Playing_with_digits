import java.util.ArrayList;
import java.util.List;

public class DigPow {

    public static Integer[] splitToDigits(int n) {
        List<Integer> digits = new ArrayList<Integer>();
        digitsList(n, digits);
        return digits.toArray(new Integer[]{});
    }

    private static void digitsList(int n, List<Integer> digits) {
        if (n / 10 > 0) {
            digitsList(n / 10, digits);
        }
        digits.add(n % 10);
    }
    public static long digPow(int n, int p) {

        long k = 0;
        long sum = 0;
        Integer[] digits = splitToDigits(n);
        List<Integer> powerDigits = new ArrayList<>();

        for (int i = 0; i < digits.length; i++){
            int powered = (int) Math.pow(digits[i],p);
            p++;
            powerDigits.add(powered);
        }
        for (int i : powerDigits)
            sum += i;
        k = sum/n;
        if(sum%n != 0){
            k = -1;
        }
        System.out.println(k);
        return k;
    }

    public static void main(String[] args) {

        digPow(46288,3);

    }

}