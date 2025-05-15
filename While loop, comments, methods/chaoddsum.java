import java.util.Scanner;

public class chaoddsum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        int sum=0;
        while (true){
            System.out.print("Enter the number till where you need the sum of odd numbers: ");
            if(input.hasNextInt()){
                n=input.nextInt();
                for(int i=1;i<=n;i=i+2){
                    sum=sum+i;
                }
                System.out.println("The end sum of odd numbers till " + n + " is: " + sum );
                break;
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
}
