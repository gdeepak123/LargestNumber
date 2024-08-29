import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number1:");
        int number1 = sc.nextInt();
        System.out.println("enter a number2:");
        int number2 = sc.nextInt();
        System.out.println("enter a number3:");
        int number3 = sc.nextInt();

        int largest = number1;

        if (number2 > largest) {
            largest = number2;
        }

        if (number3 > largest) {
            largest = number3;
        }

        System.out.println("The largest number is:" + largest);
    }
}

