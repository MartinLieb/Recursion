import java.util.Scanner;

public class FactoralRecursion {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = input.nextInt();

        System.out.println("Factoral of " + n + " is " + factoral(n));


    }

    public static long factoral(int n){
        if (n==0){
            return 1;
        }
        else
            return n * factoral(n-1);
    }
}
