import java.util.Scanner;

public class ChallengeSwap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int a = input.nextInt();
        System.out.println("Enter your second number: ");
        int b = input.nextInt();
        System.out.println("The numbers are " + a + " " + b);
        int c = a;
        a = b;
        b = c;
        System.out.println("The numbers after swapping are " + a + " " + b);

    }
}
