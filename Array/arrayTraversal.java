import java.util.Scanner;

public class arrayTraversal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        arrayTraversal obj = new arrayTraversal();

        int len;
        System.out.println("Enter the length of the Array: ");
        if (input.hasNextInt()) {
            len = input.nextInt();
            if (len <= 0) {
                System.out.println("Enter a valid length.");
            }
            int[] myArray = new int[len];
            obj.input(myArray);
            obj.output(myArray);
        }
        else {
            System.out.println("Invalid input.");
        }
        input.close();
    }

    public void input(int[] Array) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < Array.length; i++) {
            System.out.println("Enter the number at index " + i + ".");
            Array[i] = input.nextInt();
        }
    }

    public void output(int[] Array) {
        System.out.print("The array thus made is: ");
        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i] + "\t");
        }
    }
}
