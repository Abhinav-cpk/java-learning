import java.util.Scanner;

public class challprime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        challprime obj = new challprime();

        int num;
        String result;
        while(true){
            System.out.print("Enter the number to verify: ");
            if(input.hasNextInt()){
                num = input.nextInt();
                if(num<1){
                    System.out.println("Enter a number greater than 0.");
                    continue;
                }
                result = obj.prime(num);
                System.out.println("The number " + num + " is " + result +".");
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

    public String prime(int a){
        if(a==1){
            return "Not Prime";
        }
        else if(a==2){
            return "Prime";
        }
        else{
            for(int i = 2; i<=Math.sqrt(a) ; i++){
                if( a%i == 0 ){
                    return "Not Prime";
                }
            }
        }
        return "Prime";
    }
}
