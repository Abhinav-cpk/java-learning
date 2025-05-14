import java.util.Scanner;

public class Return {
    public static void main(String[] args) {
        System.out.println("Welcome to the adding sector");
        System.out.println("Please enter you numbers with spaces or just type exit: ");
        int[] numbers = readnumbers();
        if(numbers!= null){
            int result = sum(numbers[0], numbers[1]);
            System.out.println("The sum is: " + result);
        }
        //Return obj = new Return (add(a,b));
    }

    public static int[] readnumbers() {
        Scanner input = new Scanner(System.in);
        int x, y;
        while (true) {
            if (input.hasNextInt()) {
                x = input.nextInt();
                if (input.hasNextInt()) {
                    y = input.nextInt();
                    return new int[] {x,y};
                } else {
                    String temp = input.next().trim();
                    if (temp.equalsIgnoreCase("Exit")) {
                        System.out.println("Exiting the program");
                        break;
                    } else {
                        System.out.println("Enter a valid second number");
                        input.nextLine();
                    }
                }
            } else {
                String temp = input.next().trim();
                if (temp.equalsIgnoreCase("Exit")) {
                    System.out.println("Exiting the program");
                    break;
                } else {
                    System.out.println("Enter a valid first number");
                    input.nextLine();
                }
            }
        }
        return null;
    }

    public static int sum(int a,int b){
        return a+b;
    }
}