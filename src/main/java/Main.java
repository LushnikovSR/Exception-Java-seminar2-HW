import java.io.PrintStream;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    //Задание №4
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");

        String temp = scanner.nextLine();
        if (temp == "")
            throw new Exception("Пустые строки вводить нельзя.");

        System.out.printf("Hello %s!", temp);

    }

    /*
    //Задание №3
    public static void main(String[] args) throws NullPointerException, IndexOutOfBoundsException, Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Exception ex) {
            System.out.println("Что-то пошло не так...");
        }
    }
    public static void printSum(Integer a, Integer b) throws NullPointerException {
        System.out.println(a + b);
    }
    */
    /*
    public static void main(String[] args) {

        /*
        // Задание №2
        int[] intArray = new int[]{1, 2, 4, 3, 6, 5, 8, 7, 9};
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        }
        //Задание №1
        System.out.printf("User enter number %.2f", inputFloat());
    }

     */


    public static float inputFloat() {

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter a fractional number: ");

            if (scanner.hasNextFloat()) {
                float number = scanner.nextFloat();
                return number;
            }
        }
    }
}
