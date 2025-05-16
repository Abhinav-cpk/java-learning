import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        armstrong obj = new armstrong();
        int num;
        while(true){
            System.out.print("Enter the number to find if it's armstrong or not or type exit: ");
            if(input.hasNextInt()){
                num = input.nextInt();
                if(num<0){
                    System.out.println("Enter a positive number: ");
                    continue;
                }
                int result = obj.verify(num);
                if(result == num){
                    System.out.println("The given number is an armstrong number.");
                }
                else{
                    System.out.println("The given number is not an armstrong number");
                }
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
    public int verify(int a){
        int sum=0;
        String astring = String.valueOf(a);
        int len = astring.length();
        while(a!=0){
            int rem = a%10;
            sum = sum + (int) Math.pow(rem,len); // pow always works on double add(int)
            a=a/10;
        }
        return sum;
    }
}
