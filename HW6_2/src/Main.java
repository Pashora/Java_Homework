import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int isEdekaOpen = 8;
        int isEdekaClose = 16;
        int isReweOpen = 12;
        int isReweClose = 23;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько сейчас времени?");
        int hour = scanner.nextInt();
        if (hour > isReweClose || hour < isEdekaOpen) {
            System.out.println("Все магазины закрыты");

        } else {
            System.out.println("Я могу купить еду в :\n " + " isEdekaOpen: " + canBuyInEdeka(isEdekaOpen, isEdekaClose, hour)
                    + "\n isReweOpen : " + canBuyInRewe(isReweOpen, isReweClose, hour));
        }
    }

    static boolean canBuyInEdeka(int isEdekaOpen, int isEdekaClose, int hour) {
        if (hour < isEdekaClose && hour >= isEdekaOpen) {
            return true;

        } else {
            return false;
        }
    }

    static boolean canBuyInRewe(int isReweOpen, int isReweClose, int hour) {
        if (hour < isReweClose && hour >= isReweOpen) {
            return true;

        } else {
            return false;
        }
    }

}

