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
 * @implSpec - 
 *
 ************************************************************************************/
public class PrimesBelowN {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean[] primesArray = new boolean[n+1];
        // Initialize array with default as false
        for(int i=0; i <= n; i++){
            primesArray[i] = true;
        }
        int i = 2;
        while( i <= n){
            for(int j=1; j <= i/j; j++){
                if(i%j == 0 && j != 1 && i != j) {
                    primesArray[i] = false;
                }
            }
            i++;
        }
        System.out.println("Print Primes Array: ");
        System.out.println("--------------------------");
        System.out.println("Number            Is Prime");
        System.out.println("--------------------------");
        for(int k=0; k<=n; k++){
            System.out.println("\t"+ k + "\t\t" + "|" + "\t\t" + primesArray[k]);
        }
        System.out.println("--------------------------");
    }
}
