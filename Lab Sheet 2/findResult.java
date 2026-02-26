


import java.util.Scanner;
class findResult {
    public static void main(String[] args) {

        String result;
        Scanner input = new Scanner(System.in); 

        System.out.println("Enter a mark: ");
        int mark = input.nextInt(); 

        result = (mark > 50) ? "Pass" : "Fail"; 
        System.out.println(result);
        
        input.close();
        
    }
}