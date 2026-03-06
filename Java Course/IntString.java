
import java.util.Scanner;

public class IntString {
    public static void main(String[] args) {

        
        // common issues
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age : ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your fav Color : ");
        String color = scanner.nextLine();

        System.out.println("your are " + age + " years old");
        System.out.println("You like the color " + color);

        scanner.close();

    }

}