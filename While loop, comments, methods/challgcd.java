import java.util.Scanner;

public class challgcd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        challgcd obj = new challgcd();
        int num1,num2;
        while(true){
            System.out.print("Enter you numbers with spaces or type exit: ");
            if(input.hasNextInt()){
                num1 = input.nextInt();
                if(num1<=0){
                    System.out.println("Enter a positive first number:");
                    input.nextLine();
                    continue;
                }
                if(input.hasNextInt()) {
                    num2 = input.nextInt();
                    if (num2 <= 0) {
                        System.out.println("Enter a positive second number:");
                        input.nextLine();
                        continue;
                    }
                    int result = obj.gcd(num1,num2);
                    System.out.println("The GCD of the given two numbers is: "  + result);

                    System.out.print("Do you want to calculate another GCD? (yes/no): ");
                    input.nextLine(); // consume leftover newline
                    String again = input.nextLine().trim();
                    if (!again.equalsIgnoreCase("yes")) {
                        System.out.println("Goodbye!");
                        break;
                    }
                }
                else{
                    String temp = input.next().trim();
                    if (temp.equalsIgnoreCase("Exit")) {
                        System.out.println("Exiting the program.");
                        break;
                    } else {
                        System.out.println("Enter a valid second number.");
                        input.nextLine();
                    }
                }
            }
            else{
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
    }
    public int gcd(int a, int b){
        while(b!=0){
            int temp = b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}
