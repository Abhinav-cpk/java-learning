import java.util.Scanner;

public class ChallengeSwap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int firstNum = input.nextInt();
        System.out.println("Enter your second number: ");
        int secNum = input.nextInt();
        System.out.println("The numbers are " + firstNum + " " + secNum);
        int c = firstNum;
        firstNum = secNum;
        secNum = c;
        System.out.println("The numbers after swapping are " + firstNum + " " + secNum);

    }
}
