import java.util.Scanner;

public class si {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        float p = input.nextFloat();
        System.out.print("Enter the time in years: ");
        int t = input.nextInt();
        System.out.print("Enter the rate of interest: ");
        float r = input.nextFloat();
        System.out.println("The simple interest comes out to be: " + (p*t*r)/100);
    }
}
