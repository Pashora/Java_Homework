import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y, z;
        System.out.println("Введите первое число");
        x = scanner.nextInt();
        System.out.println("Ведите второе число");
        y = scanner.nextInt();
        System.out.println("Ведите третье число");
        z = scanner.nextInt();
        int max = x;
        if (y > max) {
            max = y;
        }
        if (z > max) {
            max = z;

        }
        System.out.println("Самое большое число из трёх " + max);
        int min = x;
        if (y < min) {
            min = y;
        }
        if (z < min) {
            min = z;
        }
        System.out.println("Самое маленькое число из трёх " + min);
        int midl = x;
        if (y < max && y > min) {
            midl = y;
        }
        if (z < max && z > min) {
            midl = z;

        }
        System.out.println("Это среднее число " + midl);
        System.out.println();

        System.out.println(" Максимальное значение из трёх чисел " + max +"" + midl + "" + min);

    }
}
