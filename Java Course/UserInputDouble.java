
import java.util.Scanner;

public class UserInputDouble {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your gpa : ");

        double gpa = scanner.nextDouble();

        System.out.println("Your gpa is " + gpa);


        scanner.close();

    }

}
