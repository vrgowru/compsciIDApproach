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
public class VerifySinCosSqr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double theta = sc.nextDouble();
        double sinSqrTheta = Math.sin(theta) * Math.sin(theta);
        double cosSqrTheta = Math.cos(theta) * Math.cos(theta);
        System.out.println("Printing: "+ (sinSqrTheta + cosSqrTheta));
    }
}
