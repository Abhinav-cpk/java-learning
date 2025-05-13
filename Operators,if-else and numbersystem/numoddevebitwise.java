import java.util.Scanner;

public class numoddevebitwise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long a;
        while(true){
        System.out.println("Enter your number: ");
        if(input.hasNextLong()){
          a = input.nextLong();

          if(((a&1)%2) != 0){
              System.out.println("The given number is odd.");
            }
            else{
                System.out.println("The given number is even.");
            }
            break;
         }
        else{
              String temp = input.next().trim();
              if(temp.equalsIgnoreCase("Exit")){
                  System.out.println("Exiting the program");
                  break;
            }
              else{
                  System.out.println("Enter a valid number.");
              }
        }
        }
        input.close();
    }
}