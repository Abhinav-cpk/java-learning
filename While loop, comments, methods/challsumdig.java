import java.util.Scanner;

public class challsumdig {
    public static void main(String[] args) {
        /* this program is to execute a program that
         sums up the digits of a given number.*/
        Scanner input = new Scanner(System.in);

        int num;
        challsumdig obj = new challsumdig();
        while(true){
            System.out.print("Enter the number or type exit to quit: ");
            if(input.hasNextInt()){
                num= input.nextInt();
                if(num < 0){
                    System.out.println("Enter a positive number: ");
                    continue;
                }
                int result = obj.digadd(num);
                System.out.println("The sum of the digits is " + result);
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
        input.close();
    }
    public int digadd(int a){
        int sum = 0;
        while(a>0){
            int dig = a%10;
            sum = sum+dig;
            int rem = a/10;
            a=rem;
        }
        return sum;
    }
}
