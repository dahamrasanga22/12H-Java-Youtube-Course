
import java.util.Scanner;

public class UserInputInt {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Age : ");
        int age = scanner.nextInt();

        System.out.println("My age is " + age);

        System.out.println("R u a Student ( Yes / No ): ");
        

        scanner.close();
   }

}
