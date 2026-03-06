
import java.util.Scanner;

public class UserInputString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Name : ");
        String name = scanner.nextLine();
        System.out.println("Hellooo " + name);


        System.out.print("Enter Age : ");
        int age = scanner.nextInt();
        System.out.println("My age is " + age);

        scanner.close();

    }

}
