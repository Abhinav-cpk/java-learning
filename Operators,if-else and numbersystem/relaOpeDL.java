import java.util.Scanner;

public class relaOpeDL {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This the Driving License Age Verifier:");
        System.out.println();
        System.out.println("Enter you age: ");
        int age = input.nextInt();
        if (age >=18 && age <65) {
            System.out.println("You are eligible to apply for a DL.");
        }
        else if (age >= 65) {
            System.out.println("You old hag you really need to rest now, no one got time to make you a DL.");
        }
        else {
            System.out.println("Go home kiddo you ain't big enough");
        }
        input.close();
    }
}
