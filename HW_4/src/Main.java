import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a  first word");
        String word1 = scanner.nextLine();

        System.out.println("Enter a second word:");
        String word2 = scanner.nextLine();

        int Lenght1 = word1.length();
        int Lenght2 = word2.length();

        if (Lenght1 % 2 != 0 || Lenght2 % 2 != 0) {
            System.out.println("The words must on even number of letter");
            return;


        }
        String newWord = word1.substring(0, Lenght1 / 2) + word2.substring(Lenght2 / 2, Lenght2);
        System.out.println("The combined word is:" + newWord);
    }
}
