import java.util.Scanner;

/************************************************************************************
 * These are set of programs written for Computer Science: Programming with a Purpose
 * course on coursera linked below
 * @link - https://www.coursera.org/learn/cs-programming-java/home/welcome
 *
 * The programs contain examples, solutions to chapter exercises
 * programming assignments and are authored by
 *
 * @author Venkateshwara Gowru
 *
 * @implSpec - Implements a random coupon collector that prints out minimum number of passes
 * needed before collecting all coupons.
 *
 ************************************************************************************/
public class CouponCollector {
    public static int[] createCouponArray(int size) {
        int[] coupons = new int[size];
        for (int i = 0; i < size; i++) {
            coupons[i] = i;
        }
        return coupons;
    }

    public static void minimumCouponsNeeded(int[] couponsSample) {
        int totalCoupons = couponsSample.length;
        boolean[] collectedCoupons = new boolean[totalCoupons];
        int distinctCouponsCount = 0;
        int totalCouponsCollected = 0;
        for (int i = 0; i < totalCoupons; i++) {
            collectedCoupons[i] = false;
        }
        while (distinctCouponsCount != totalCoupons) {
            int r = (int) (totalCoupons * Math.random());
            if(collectedCoupons[r] == false) {
                collectedCoupons[r] = true;
                distinctCouponsCount++;
            }
            totalCouponsCollected++;
        }
        System.out.println("Minimum coupons needed to collect all coupons: "+ totalCouponsCollected);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sampleArraySize = scanner.nextInt();
        int totalSamplesToTry = scanner.nextInt();
        int[] couponsSample = createCouponArray(sampleArraySize);
        for (int i = 0; i < totalSamplesToTry; i++) {
            minimumCouponsNeeded(couponsSample);
        }
    }
}
