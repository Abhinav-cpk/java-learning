import java.util.Scanner;

public class challengeage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = -1;
        while(true){
            System.out.print("Enter your age: ");
            if(input.hasNextInt()) {
                age = input.nextInt();
                if (age >= 0 && age <= 120) {
                    if (age < 13) {
                        System.out.println("You are a child");
                    } else if (age < 20) {
                        System.out.println("You are a teen");
                    } else if (age < 60) {
                        System.out.println("You are an adult");
                    } else {
                        System.out.println("You are a senior citizen");
                    }
                    break;
                }
                else {
                    System.out.println("Enter a valid age");
                }
            }
            else{
                String temp = input.next().trim();
                if(temp.equalsIgnoreCase("Exit")){
                    System.out.println("Exiting the Program");
                    break;
                }
                else{
                    System.out.println("Enter a valid age in numbers");
                }
            }
        }
        input.close();
    }
}

