import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите какой год : ");
        int year = scanner.nextInt();
        if (((year % 4 == 0) && (year % 100 != 0)) || year % 400 == 0) {
            System.out.println("Год высокосный");
        } else {
            System.out.println("Не высокосный");
        }
    }
}
