import java.net.ServerSocket;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        if (check(103, 80)) System.out.println("Оборудование работает исправно");
        else System.out.println("Оборудование не работает");


    }

    public static boolean check(int temp1, int temp2) {
        if (temp1 > 100 && temp2 < 100) return true;
        else return false;
    }
}




