import java.util.Random;
import java.util.Scanner;
public class CouponNumbers {
    static int generateCoupon(int n) {
        Random random = new Random();
        return random.nextInt(n);
    }
    static int countDistinctCoupons(int n) {
        boolean[] collected = new boolean[n];
        int distinctCount = 0;
        int totalRandomNumbers = 0;

        while (distinctCount < n) {
            int coupon = generateCoupon(n);
            totalRandomNumbers++;

            if (!collected[coupon]) {
                collected[coupon] = true;
                distinctCount++;
            }
        }
        return totalRandomNumbers;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of distinct coupons: ");
        int n = sc.nextInt();
        int result = countDistinctCoupons(n);
        System.out.println("Total random numbers needed: " + result);
    }
}