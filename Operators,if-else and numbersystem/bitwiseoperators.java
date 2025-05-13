import java.util.Scanner;

public class bitwiseoperators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        while (true) {
            System.out.print("Enter your two numbers with spaces between them or type exit to quit: ");
            if (input.hasNextInt()) {
                a = input.nextInt();
                if (input.hasNextInt()) {
                    b = input.nextInt();
                    System.out.print("Bitwise and operation a & b: ");
                    System.out.println(a & b);
                    System.out.print("Bitwise or operation a | b: ");
                    System.out.println(a | b);
                    System.out.print("Bitwise not operation ~a: ");
                    System.out.println(~a);
                    System.out.print("Bitwise not operation ~b: ");
                    System.out.println(~b);
                    System.out.print("Bitwise XOR operation a ^ b: ");
                    System.out.println(a ^ b);
                    System.out.print("Bitwise right shift operation a>>2: ");
                    System.out.println(a >> 2);
                    System.out.print("Bitwise left shift operation a<<2: ");
                    System.out.println(a << 2);
                    break;
                } else {
                    String temp = input.next().trim();
                    if (temp.equalsIgnoreCase("Exit")) {
                        System.out.println("Exiting the program");
                        break;
                    } else {
                        System.out.println("Enter a valid second number.");
                    }
                }
            } else {
                String temp = input.next().trim();
                if (temp.equalsIgnoreCase("Exit")) {
                    System.out.println("Exiting the program");
                    break;
                } else {
                    System.out.println("Enter a valid first number.");
                }
            }
        }
        input.close();
    }
}
