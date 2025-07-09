import java.util.Scanner;

public class Main {

    public static void main (String[] args){
        System.out.println("Student test");
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.print("Enter your height:");
        double height = scanner.nextDouble();
        if (age <18) {
            System.out.println("You are a minor.");
        } else {
            System.out.println("You are an adult.");
        }

        
    }
    
}
