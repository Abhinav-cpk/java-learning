import java.util.Scanner;

public class arrayMultipleSearches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArraySearch obj = new ArraySearch();

        while (true) {
            System.out.print("Enter the length of the array: ");
            if (input.hasNextInt()) {
                int len = input.nextInt();
                if (len <= 0) {
                    System.out.println("Enter a valid positive number.");
                    continue;
                }

                int[] myArray = new int[len];
                System.out.println("Enter the elements of the array:");
                obj.input(myArray);

                System.out.print("The array you entered is: ");
                obj.output(myArray);

                // Start search loop
                while (true) {
                    System.out.print("Enter the number you want to search or type 'done' to re-enter a new array or 'exit' to quit: ");
                    if (input.hasNextInt()) {
                        int num = input.nextInt();
                        int isfound = obj.search(myArray, num);
                        if (isfound == 1) {
                            System.out.println("The number is present in the array.");
                        } else {
                            System.out.println("The number is not present in the array.");
                        }
                    } else {
                        String temp = input.next().trim();
                        if (temp.equalsIgnoreCase("done")) {
                            break; // go back and input a new array
                        } else if (temp.equalsIgnoreCase("exit")) {
                            System.out.println("Exiting the program.");
                            input.close();
                            return;
                        } else {
                            System.out.println("Enter a valid number or command.");
                        }
                    }
                }

            } else {
                String temp = input.next().trim();
                if (temp.equalsIgnoreCase("exit")) {
                    System.out.println("Exiting the program.");
                    input.close();
                    break;
                } else {
                    System.out.println("Enter a valid number.");
                }
            }
        }
    }

    public void input(int[] array) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element at index " + i + ": ");
            array[i] = input.nextInt();
        }
    }

    public void output(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }

    public int search(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                System.out.println("The number is at index " + i);
                return 1;
            }
        }
        return -1;
    }
}
