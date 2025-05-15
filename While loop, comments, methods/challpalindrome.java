import java.util.Scanner;

public class challpalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        challpalindrome obj = new challpalindrome();
        int num;
        while (true) {
            System.out.print("Enter the number that is to be verified or type exit: ");
            if (input.hasNextInt()) {
                num = input.nextInt();
                if (num < 0) {
                    System.out.println("Enter a positive number: ");
                    continue;
                }
                int result = obj.reverse(num);
                if (result == num) {
                    System.out.println("The given number is a palindrome");
                }
                else {
                    System.out.println("The given number is not a palindrome");
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

    public int reverse(int a){
        int rev = 0;
        while( a!=0) {
            int rem = a%10;
            rev = (rev*10) + rem;
            a=a/10;
        }
        return rev;
    }
}
