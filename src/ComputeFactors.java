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
public class ComputeFactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int factor = 2; factor <= n/factor; factor++){
            while( n%factor ==0){
                System.out.print(factor);
                n /= factor;
            }
        }
        if(n>1) System.out.print(n);
        System.out.println();
    }
}
