import java.util.Scanner;

public class Main {

    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        int n = scanner.nextInt();
        int reversed=0;
        while(n!=0){
            int digit=n%10;
            reversed=reversed*10 + digit;
            n=n/10;

        }
        System.out.println(reversed);
        scanner.close();

        


        
    }
    
}
