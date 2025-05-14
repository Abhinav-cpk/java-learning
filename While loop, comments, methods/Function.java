import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x,y;

        while (true) {
            System.out.print("Enter you numbers or type exit to quit the program: ");

            if (input.hasNextInt()) {
                 x = input.nextInt();
                if (input.hasNextInt()) {
                    y = input.nextInt();
                    int result = add(x, y);
                    System.out.println("Sum is: " + result);
                    break;
                } else {
                    String temp = input.next().trim();
                    if (temp.equalsIgnoreCase("Exit")) {
                        System.out.println("Exiting the program.");
                        break;
                    } else {
                        System.out.println("Enter a valid second number.");
                        input.nextLine();
                    }
                }
            } else {
                String temp = input.next().trim();
                if (temp.equalsIgnoreCase("Exit")) {
                    System.out.println("Exiting the program.");
                    break;
                } else {
                    System.out.println("Enter a valid first number.");
                    input.nextLine();
                }
            }
        }
        input.close();
    }
    public static int add ( int a, int b) {
        int sum;
        sum = a + b;
        return sum;
    }
}
