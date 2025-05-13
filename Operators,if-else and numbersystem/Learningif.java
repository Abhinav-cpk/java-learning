import java.util.Scanner;

public class Learningif {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter you Gender: ");
        String gender = input.nextLine().trim(); // trim() removes any leading or trailing space
        if (gender.equalsIgnoreCase("Male")) { // IgnoreCase ignores the upper and lowercases and treats Male, male,MALE etc. the same
            System.out.println("The user is a male.");
        }
        else if (gender.equalsIgnoreCase("Female")) {
            System.out.println("The user is a female.");
            }
        else {
            System.out.println("The user is non-binary.");
        }
        input.close();  // frees the resources allocated
    }
}
