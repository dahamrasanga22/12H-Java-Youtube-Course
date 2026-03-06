
import java.util.Scanner;

public class UserInputBoolean {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Are you a Student? ( true / false ): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Student : " + isStudent);

        scanner.close();
    }

}
