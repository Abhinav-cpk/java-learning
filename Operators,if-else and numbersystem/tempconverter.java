import java.util.Scanner;

public class tempconverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature in fahrenheit: ");
        float temp = input.nextFloat();
        System.out.println("the temperature in celsius is: " + ((temp-32) * 5/9));
    }
}
