import java.util.Scanner;

public class ChMultiTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a;

        while(true){
            System.out.println("Welcome to table generator: ");
            System.out.println("Either enter the number or type exit to quit.");
            System.out.print("Enter the numbers whose table is to be printed: ");
            if (input.hasNextInt()) {
                a = input.nextInt();
                int range;
                System.out.println("Enter the range of the table: ");
                if (input.hasNextInt()) {
                    range = input.nextInt();
                    for (int i = 1; i <= range; i++) {
                        System.out.println(a + " * " + i + " = " + a * i);
                    }
                }
                else {
                    String temp = input.next().trim();
                    if (temp.equalsIgnoreCase("Exit")) {
                        System.out.println("Exiting the program.");
                        break;
                    } else {
                        System.out.println("Enter a valid number.");
                        input.nextLine();
                    }
                }
            }
            else {
                String temp = input.next().trim();
                if (temp.equalsIgnoreCase("Exit")) {
                    System.out.println("Exiting the program.");
                    break;
                } else {
                    System.out.println("Enter a valid number.");
                    input.nextLine();
                }
            }
        }
        input.close();
    }
}
