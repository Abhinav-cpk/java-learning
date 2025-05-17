import java.util.Scanner;

public class ArraySearch{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArraySearch obj = new ArraySearch();

        int len;
        while(true){
            System.out.println("Type 'exit' anytime to close the program.");
            System.out.print("Enter the length of the array: ");
            if(input.hasNextInt()) {
                len = input.nextInt();
                if (len <= 0) {
                    System.out.println("Enter a valid positive number.");
                    continue;
                }
                int[] myArray = new int[len];
                System.out.print("Enter the elements of the array with spaces between them: ");
                obj.input(myArray);
                System.out.print("The array you entered is: ");
                obj.output(myArray);
                while (true) {
                    System.out.print("Enter the number that you want to search or exit to quit: ");
                    if (input.hasNextInt()) {
                        int num = input.nextInt();
                        int isfound = obj.search(myArray, num);
                        if (isfound == 1) {
                            System.out.println("The number is present in the array");
                        } else {
                            System.out.println("The number is not present in the array.");
                        }
                    } else {
                        String temp = input.next().trim();
                        if (temp.equalsIgnoreCase("Exit")) {
                            System.out.println("Exiting the program.");
                            break;
                        } else {
                            System.out.println("Enter a valid number.");
                        }
                    }
                }
            }
                else{
                    String temp = input.next().trim();
                    if(temp.equalsIgnoreCase("Exit")){
                        System.out.println("Exiting the program.");
                        break;
                    }
                    else{
                        System.out.println("Enter a valid number.");
                    }
                }
            }
        input.close();
        }
    public void input(int[] array){
        Scanner input = new Scanner(System.in);
        int index=0;
        while(index < array.length){
            array[index] = input.nextInt();
            index++;
        }
    }

    public void output(int[] array){
        int index = 0;
        while(index < array.length){
            System.out.print(array[index] + "\t");
            index++;
        }
        System.out.println();
    }

    public int search(int[] array, int num){
        int index=0;
        while(index < array.length){
            if(array[index] == num){
                System.out.println("The number is at index " + index);
                return 1;
            }
            index++;
        }
        return -1;
    }
}