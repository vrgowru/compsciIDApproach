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
public class BinaryConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int power = 1;
        while(power <= n/2){
            power *=2;
        }
        System.out.println("Highest Power: "+ power);
        while(power > 0){
            if(n < power) { System.out.print(0); } else {
                System.out.print(1); n -= power;
            }
            power = power/2;
        }
    }
}
