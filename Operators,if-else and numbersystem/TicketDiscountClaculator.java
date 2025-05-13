import java.util.Scanner;

public class TicketDiscountClaculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This is the Ticket Discount Generator:");
        System.out.println();
        System.out.print("Enter you Gender: ");
        String gender = input.nextLine().trim();
        int age = -1;
        while(true) {
            System.out.print("Enter you age: ");
            if(input.hasNextInt()){
                age = input.nextInt();
                if(age>=0 && age<=120){
                    break;
                }
                else{
                    System.out.println("Enter a valid age between 0 and 120.");
                }
            }
            else {
                System.out.println("The age entered must be a number, thus enter an integer:");
                input.next();
            }
        }
        if (gender.equalsIgnoreCase("Female")){
            if (age<=5){
                System.out.println("You get a 75% Discount:");
            }
            else {
                System.out.println("You get a 50% discount");
            }
        }

        else {
            if (age<=5){
                System.out.println("You get a 75% Discount:");
            }
            else if(age<=65){
                System.out.println("You get no discount: ");
            }
            else{
                System.out.println("You get a 25% Discount:");
            }
        }
        input.close();
    }
}
