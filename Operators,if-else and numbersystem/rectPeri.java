import java.util.Scanner;

public class rectPeri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter rectangle's length: ");
        int a = input.nextInt();
        System.out.print("Enter rectangle's breadth: ");
        int b = input.nextInt();
        System.out.println("Perimeter of the rectangle is: " + 2*(a+b));
    }
}
