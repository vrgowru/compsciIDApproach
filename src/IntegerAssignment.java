public class IntegerAssignment {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int t = a;
        b = t;
        a = b;
        System.out.println("\n Printing a: "+ a);
        System.out.println("\n Printing b: "+ b);
        System.out.println("\n Printing t: "+ t);
    }
}