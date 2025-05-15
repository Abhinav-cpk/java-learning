import java.util.Scanner;

public class challfact {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        challfact obj = new challfact();

        int num;
        System.out.print("Enter the number whose factorial is to be calculated: ");
        while (true) {
            if (input.hasNextInt()) {
                num = input.nextInt();
                if(num<0){
                    System.out.print("Enter a positive number:");
                continue;
                }
                int result = obj.fact(num);
                System.out.println("The factorial of " + num + " is " + result + ".");
                break;
            } else {
                String temp = input.next().trim();
                if (temp.equalsIgnoreCase("Exit")) {
                    System.out.println("Exiting the program.");
                    break;
                } else {
                    System.out.print("Enter a valid number:");
                  input.nextLine();
                }
            }
        }
        input.close();
    }

    public int fact(int a) {
        if(a==0 || a==1){
            return 1;
        }
        else {
            for (int i = a - 1; i >= 1; i--) {
                a = a * i;
            }
            return a;
        }
    }
}