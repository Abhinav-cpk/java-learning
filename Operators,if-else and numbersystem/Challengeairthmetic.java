import java.util.Scanner;

public class Challengeairthmetic {
    public static void main(String[] args) {
        // airthmetic operation
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int a = input.nextInt();
        System.out.print("Enter your number: ");
        int b = input.nextInt();
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a / b);
        System.out.println(a * b);
        System.out.println(a % b);
    }
}
