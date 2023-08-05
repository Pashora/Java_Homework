import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[5];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10, 99);
        }
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        boolean isSorted = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] >= array[i]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) System.out.println("Our array is sorted");
        else System.out.println("Our array is not sorted");

    }
}