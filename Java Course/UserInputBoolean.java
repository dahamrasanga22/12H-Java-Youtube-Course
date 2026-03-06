
import java.util.Scanner;

public class UserInputBoolean {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Are you a Student? ( true / false ): ");
        boolean isStudent = scanner.nextBoolean();

        
        System.out.println("Student : " + isStudent);

<<<<<<< HEAD

=======
        
>>>>>>> e05cc6a67570fd2ace0f732e02f9b07f38d0e662
        if (isStudent) {
            System.out.println("You are enrolled as Student");
        } else {
            System.out.println("You are NOT enrolled ");
        }

<<<<<<< HEAD
=======

>>>>>>> e05cc6a67570fd2ace0f732e02f9b07f38d0e662
        scanner.close();
    }

}
