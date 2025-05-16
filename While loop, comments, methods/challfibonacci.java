import java.util.Scanner;

public class challfibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        challfibonacci obj = new challfibonacci();

        int num;
        while(true){
            System.out.print("Enter the number till which you want the fibonacci series: ");
            if(input.hasNextInt()){
                num = input.nextInt();
                if (num <= 0) {
                    System.out.println("Enter a number greater than 0.");
                    continue;
                }
                obj.fibo(num);
            }
            else{
                String temp = input.next().trim();
                if (temp.equalsIgnoreCase("Exit")) {
                    System.out.println("Exiting the program.");
                    break;
                } else {
                    System.out.println("Enter a valid number.");
                    input.nextLine();
                }
            }
        }
    }

    public void fibo(int n) {
        System.out.println("The Fibonacci series is:");

        int a = 0;
        int b = 1;

        if (n >= 1) System.out.print(a + " ");
        if (n >= 2) System.out.print(b + " ");

        for (int i = 3; i <= n; i++) {
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
        System.out.println();
    }
}
