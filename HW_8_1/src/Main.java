import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] wholeNumbers = new int[8];
        Random random = new Random();
        for (int i = 0;i < wholeNumbers.length;i++){
            wholeNumbers[i] = random.nextInt(1,50);
        }
        System.out.println(Arrays.toString(wholeNumbers));
        for (int i = 1; i <wholeNumbers.length;i = i+3){
            wholeNumbers[i] = 0;
        }
        System.out.println(Arrays.toString(wholeNumbers));


        }
    }
