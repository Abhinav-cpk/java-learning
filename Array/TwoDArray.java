import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TwoDArray obj = new TwoDArray();

        int row;
        int col;
        while (true) {
            System.out.print("Enter the no. of rows or type 'Exit': ");
            if (input.hasNextInt()) {
                row = input.nextInt();
                if (row <= 0) {
                    System.out.println("Enter a valid positive number.");
                    continue;
                }
            } else {
                String temp = input.next().trim();
                if (temp.equalsIgnoreCase("exit")) {
                    System.out.println("Exiting the program.");
                    input.close();
                    break;
                } else {
                    System.out.println("Enter a valid number.");
                    continue;
                }
            }

            System.out.print("Enter the number of columns or type exit: ");
            if (input.hasNextInt()) {
                col = input.nextInt();
                if (col <= 0) {
                    System.out.println("Enter a valid positive number.");
                    continue;
                }
            } else {
                String temp = input.next().trim();
                if (temp.equalsIgnoreCase("exit")) {
                    System.out.println("Exiting the program.");
                    input.close();
                    break;
                } else {
                    System.out.println("Enter a valid number.");
                    continue;
                }
            }
            int[][] myArray = new int[row][col];
            System.out.println("Now write the values of the array: ");
            obj.input(myArray);

            System.out.println("The array that you entered is:");
            obj.output(myArray);
        }
    }

    public void input(int[][] arr){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the elements of the 2-d array with spaces: ");
        for(int i = 0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = input.nextInt();
            }
        }
    }

    public void output(int[][] arr){
        for(int i = 0; i<arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
