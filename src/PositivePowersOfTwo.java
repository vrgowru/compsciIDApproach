import java.util.Scanner;

/************************************************************************************
 * These are set of programs written for Computer Science: Programming with a Purpose
 * course on coursera linked below
 * @link - https://www.coursera.org/learn/cs-programming-java/home/welcome
 *
 * Exercise Link
 * @link - https://introcs.cs.princeton.edu/java/13flow/
 *
 * The programs contain examples, solutions to chapter exercises
 * programming assignments and are authored by
 *
 * @author Venkateshwara Gowru
 *
 * @implSpec - 
 *
 ************************************************************************************/
public class PositivePowersOfTwo {

    public static void computePowersOfTwoUsingWhile(int n){
        int powerOfTwo = 1;
        int i = 1;
        if(n == 0 ) System.out.println(powerOfTwo);
        if(n > 31) throw new ArithmeticException("Integer computation range exceeded.");
        while( i<= n) {
            powerOfTwo = 2 * powerOfTwo;
            i += 1;
            System.out.println(powerOfTwo);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        computePowersOfTwoUsingWhile(n);
    }

}
