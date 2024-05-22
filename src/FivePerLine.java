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
public class FivePerLine {
    public static void main(String[] args) {
        for(int i= 1000; i <= 2000; i++){
            System.out.print(i + " ");
            if( i % 5 == 0){
                System.out.println("\n");
            }
        }
    }
}
