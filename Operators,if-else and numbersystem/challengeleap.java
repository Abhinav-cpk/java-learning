import java.util.Scanner;

public class challengeleap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year;
        while(true) {
            System.out.print("Enter the year you want to check is a leap year or not, else type exit to quit: ");
            if (input.hasNextInt()) {
                year = input.nextInt();

                if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)) {
                    System.out.println("The entered year is a leap year.");
                } else {
                    System.out.println("The entered year is not a leap year.");
                }
                //break;
            } else {
                String temp = input.next().trim();
                if (temp.equalsIgnoreCase("Exit")) {
                    System.out.println("Exiting the program.");
                    break;
                } else {
                    System.out.println("Enter a valid year in numbers.");
                }
            }
        }
    input.close();
    }
}
