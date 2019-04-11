import java.util.Scanner;

public class FactoralUdenRecursion {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = input.nextInt();

        System.out.println("Factoral of " + n + " is " + factoral(n));

    }

    public static long factoral(int n){
        while (n>0){
            return n*factoral(n-1);
        }
        return 1;
    }
}
