package ex3;
import java.util.Scanner;

public class conditionals {

    public static void main(String[] args) {

       // Task 1
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter first number: ");
//        int num1 = scanner.nextInt();
//
//        System.out.println("Enter second number: ");
//        int num2 = scanner.nextInt();
//
//        System.out.println(Math.max(num1, num2));
//
//        System.out.println("Enter another number: ");
//        int num3 = scanner.nextInt();
//
//        if (num3 % 2 == 0) {
//            System.out.println("num3 is  even");
//        } else {
//            System.out.println("num3 is odd");
//        }
//
//        System.out.println("Enter green or red: ");
//        String color = scanner.next();
//
//        if (color.equals("green")) {
//            System.out.println("go");
//        } else {
//            System.out.println("stop");
//        }

        // Task 2

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number between 1 and 12");
        int num1 = scanner.nextInt();

        if (num1 > 12 || num1 < 1) {
            System.out.println("invalid number");
        }

        switch (num1) {
            case 1:
            case 2:
            case 3:
                System.out.println("spring");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("summer");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("autumn");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("winter");
                break;
            default:
                System.out.println("you fool!!");
        }

    }
}
