import java.util.Scanner;

public class challreversedigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        challreversedigits obj = new challreversedigits();
        int num;
        while(true){
            System.out.print("Enter the number that is to be reversed: ");
            if(input.hasNextInt()){
                num = input.nextInt();
                if(num<0){
                    System.out.println("Enter a positive number: ");
                    continue;
                }
                if(num==0){
                    System.out.println("Enter a number greater than 0: ");
                    continue;
                }
                int result = obj.reverse(num);
                System.out.println("The reverse of " + num + " is " + result);
            }
            else{
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
