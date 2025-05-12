import java.util.Scanner;

public class ShortHand {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int a = input.nextInt();
        System.out.print("Enter your second number: ");
        int b = input.nextInt();
        System.out.println("The following shorthand operations wold be performed:");
        // the value of a gets updates each time.
        System.out.println(a+=b); // a=a+b
        System.out.println(a-=b);  // a=a-b
        System.out.println(a*=b); // a=a*b
        System.out.println(a/=b); // a=a/b
        System.out.println(a%=b); // a=a%b
    }
}
