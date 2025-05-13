import java.util.Scanner;

public class gotn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;
        while (true) {
            System.out.print("Enter the value of the three numbers with spaces: ");
            if (input.hasNextInt()) {
                a = input.nextInt();
                if (input.hasNextInt()) {
                    b = input.nextInt();
                    if (input.hasNextInt()) {
                        c = input.nextInt();
                        if (a > b && a > c) {
                            System.out.println("A is the greatest.");
                        } else if (b > c) {
                            System.out.println("Bis the greatest.");
                        } else {
                            System.out.println("Cis the greatest.");
                        }
                        break;
                    }   else {
                        String temp = input.next().trim();
                        if (temp.equalsIgnoreCase("Exit")) {
                            System.out.println("Exiting the process:");
                            break;
                        }
                        else{
                            System.out.println("Enter the correct third numbers:");
                        }
                        }
                } else {
                    String temp = input.next().trim();
                    if (temp.equalsIgnoreCase("Exit")) {
                        System.out.println("Exiting the process:");
                        break;
                    }
                    else{
                        System.out.println("Enter the correct second numbers:");
                    }
                }
            }
            else{
                String temp = input.next().trim();
                if (temp.equalsIgnoreCase("Exit")) {
                    System.out.println("Exiting the process:");
                    break;
                }
                else{
                    System.out.println("Enter the correct third numbers:");
                }
            }
            input.nextLine();
        }
        input.close();
    }
}

