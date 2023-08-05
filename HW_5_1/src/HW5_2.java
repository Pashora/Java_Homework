public class HW5_2 {
    public static void main(String[] args) {
        calculate(2000);
    }

    public static void calculate(int seconds) {
        int hours = seconds / 3600;
        if (hours >= 8) System.out.println("Это больше чем полный рабочий день");
        else if (hours >= 5) System.out.println("Осталось " + seconds / 3600 + " часов");
        else if (hours < 5 && hours >= 2) System.out.println("Осталось " + seconds / 3600 + " часа");
        else if (hours < 2 && hours >= 1) System.out.println("Остался 1 час");
        else if (hours < 1 && hours >= 0) System.out.println("Осталось меньше одного часа");
        else System.out.println("Число должно быть положительным");
    }
}
