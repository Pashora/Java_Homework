package calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Calculator {

    private final Scanner scanner = new Scanner(System.in);
    private final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public void run() {
        char mathChar;
        Double result;
        while (true) {
            System.out.println("Print the operation: ");
            mathChar = getNextLine().charAt(0);
            if (mathChar == 'E') {
                closeProgramm();
            }
            result = userInputRouter(mathChar, getInputNumbersArray());
            System.out.println(result);
        }


    }

    private double[] getInputNumbersArray() {
        System.out.print("input amount of arguments");
        int amount = Integer.parseInt(getNextLine());
        double[] inputNumbersArray = new double[amount];
        for (int i = 0; i < inputNumbersArray.length; i++) {
            System.out.print("INSERT " + (i + 1) + "number: ");
            inputNumbersArray[i] = Double.parseDouble(getNextLine());
        }
        return inputNumbersArray;
    }

    private void closeProgramm() {
        System.exit(1);
    }

    private String getNextLine() {
        System.out.println("Insert the char:");
        try {
            return reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private Double multiplication(double[] inputNumbers) {
        Double result = inputNumbers[0];

        for (int i = 1; i < inputNumbers.length; i++) {
            result *= inputNumbers[i];

        }
        System.out.println("Result of multiplication: ");
        return result;
    }

    private Double divide(double[] inputNumbers) {
        Double result = inputNumbers[0];

        for (int i = 1; i < inputNumbers.length; i++) {
            if (inputNumbers[i] != 0.0) {
                result /= inputNumbers[i];

            } else {
                System.out.println("Cant devide 0");
                return null;
            }
        }
        System.out.println("deviding result");
        return result;


    }

    private Double sum(double[] inputNumbers) {
        Double result = inputNumbers[0];

        for (int i = 1; i < inputNumbers.length; i++) {
            result += inputNumbers[i];

        }
        System.out.println("Result of sum: ");
        return result;

    }


    private Double substract(double[] inputNumbers) {
        Double result = inputNumbers[0];

        for (int i = 1; i < inputNumbers.length; i++) {
            result -= inputNumbers[i];

        }
        System.out.println("Result of substraction");
        return result;
    }

    private double getDoubleFromCommandLine() {
        System.out.print("Insert the number: ");

        return scanner.nextDouble();
    }

    private Double userInputRouter(char inputChar, double[] inputNumbers) {
        switch (inputChar) {
            case '*':
                return multiplication(inputNumbers);

            case '/':
                return divide(inputNumbers);

            case '+':
                return sum(inputNumbers);

            case '-':
                return substract(inputNumbers);

            default:
                System.out.println("Incorrect");
                return null;

        }
    }
}
