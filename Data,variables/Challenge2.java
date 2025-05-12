import java.util.Scanner;

public class Challenge2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int one = input.nextInt();
        System.out.print("Enter your second number: ");
        int two = input.nextInt();
        int sum = one +two;
        System.out.print("The sum of the two numbers is: " + sum);
    }
}
