package ex3;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Enter operator");
        String op = scanner.next();

        if (!(op.equals("+") || op.equals("-") || op.equals("/") || op.equals("*"))) {
            System.out.println("you fool");
        } else {
            switch (op) {
                case "+":
                    System.out.println(num1 + num2);
                    break;
                case "-":
                    System.out.println(num1 - num2);
                    break;
                case "/":
                    System.out.println(num1 / num2);
                    break;
                case "*":
                    System.out.println(num1 * num2);
                    break;
                default:
                    System.out.println("you fool");
            }
        }

    }
}
