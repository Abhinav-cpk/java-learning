import java.util.Scanner;

public class Challengeprodfloat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first float number: ");
        float a = input.nextFloat();
        System.out.print("Enter your second float number: ");
        float b = input.nextFloat();
        System.out.println("The product of the float numbers is: " + a*b);
    }
}
