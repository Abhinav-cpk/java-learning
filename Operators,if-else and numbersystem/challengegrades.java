import java.util.Scanner;

public class challengegrades{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int marks = -1;
        while(true){
            System.out.print("Enter the marks that need to be graded or type Exit to quit: ");
            if(input.hasNextInt()){
                marks = input.nextInt();
                if(marks >= 90)
                    System.out.println("The grade is A");
                else if(marks >= 75)
                    System.out.println("The grade is B");
                else if(marks >= 60)
                    System.out.println("The grade is C");
               else if(marks >=30)
                    System.out.println("The grade is D");
               else
                    System.out.println("The grade is A");
               //break;
            }
            else{
                String temp = input.next().trim();
                if(temp.equalsIgnoreCase("Exit")){
                    System.out.println("Exiting the program");
                    break;
                }
                else
                    System.out.println("Enter valid marks.");
            }
        }
        input.close();
    }
}
