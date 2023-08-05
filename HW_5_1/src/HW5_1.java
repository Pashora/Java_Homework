import java.util.Scanner;

public class HW5_1 {
    public static void main(String[] args) {
        System.out.println("Введите два числа");
        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = Math.abs(10 - a);
        float d = Math.abs(10 - b);
        if (c == d) {
            System.out.println("Оба числа одинаково близки");
        }
        if (c > d) {
            System.out.println(b + " ближе к 10");
        } else {
            System.out.println(a + " ближе к 10");
        }

    }
}
