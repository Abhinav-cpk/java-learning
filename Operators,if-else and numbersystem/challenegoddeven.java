import java.util.Scanner;

public class challenegoddeven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = 0;
        while (true) {
            System.out.print("Enter your number or type exit to exit the program: ");
            if (input.hasNextInt()) {
                num = input.nextInt();

                if (num % 2 == 0) {
                    System.out.println("The entered number is even.");
                } else {
                    System.out.println("The entered number is odd.");
                }
            } else {
                String temp = input.next().trim();
                if (temp.equalsIgnoreCase("exit")) {
                    System.out.println("Exiting program");
                    break;
                } else {
                    System.out.println("Enter a valid number.");
                    input.next();
                }
            }
        }
    }
}