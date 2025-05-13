import java.util.Scanner;
    public class challengeNumber {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int num = 0;
            while (true) {
                System.out.print("Enter you number: ");
                if (input.hasNextInt()) {
                    num = input.nextInt();
                    if (num > 0)
                        System.out.println("The number is positive.");
                    else if (num < 0)
                        System.out.println("The number is negative.");
                    else
                        System.out.println("The given number is zero.");
                break;
                }
                else {
                    System.out.println("Enter a valid number.");
                    input.next();
                }
            }
            input.close();
        }
    }
