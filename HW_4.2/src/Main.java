public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println(sum(3, 13));
        System.out.println(substraction(17, 38));
        System.out.println(multiplication(9, 25));
        System.out.println(division(60, 6));
    }

    public static int sum(int a, int b) {
        return a + b;
    }


    public static int substraction(int a, int b) {
        return a - b;

    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static int division(int a, int b) throws Exception {
        if (b == 0) throw new Exception("You can't divide by zero");
        return a / b;

    }

}
