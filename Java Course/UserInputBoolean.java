
import java.util.Scanner;

public class UserInputBoolean {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Are you a Student? ( true / false ): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Student : " + isStudent);

        
        if (isStudent) {
            System.out.println("You are enrolled as Student");
        } else {
            System.out.println("You are NOT enrolled ");
        }


        scanner.close();
    }

}
