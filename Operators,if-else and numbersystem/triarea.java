import java.util.Scanner;

public class triarea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter triangle's height: ");
        int a = input.nextInt();
        System.out.print("Enter triangle's breadth: ");
        int b = input.nextInt();
        System.out.println("area of the triangle is: " + 0.5*a*b);
    }
}
