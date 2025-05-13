import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("increasing order from 1 to 10");
        int a=1; //initialization
        while(a<=10){ // condition
            System.out.println(a);
            a++; // updating
        }

        System.out.println();
System.out.println("Reverse order from 500 to 1");
        int b = 500;
        while(b>=1){
                System.out.println(b);
                b=b-1;
        }
    }
}
