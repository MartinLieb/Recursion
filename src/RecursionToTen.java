public class RecursionToTen {

    public static void main(String[] args) {

        recursion(0);

    }

    public static void recursion(int x) {
        x = x + 1;
        System.out.println(x);
        if (x < 10) {
            recursion(x);
        }
    }
}


