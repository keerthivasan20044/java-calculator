import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        
        System.out.println("=== Calculator ===");
        
        Scanner ans = new Scanner(System.in);
        
        System.out.println("Enter number for a:");
        int a = ans.nextInt();
        ans.nextLine();
        
        System.out.println("Enter number for b:");
        int b = ans.nextInt();
     
        ans.nextLine();
        
        System.out.println("Choose operation: add sub mul div");
        String choice = ans.nextLine();
        
    
        if(choice.equals("add"))
             {
            System.out.println("Result: " + (a + b));
        } else if(choice.equals("sub")) {
            System.out.println("Result: " + (a - b));
        } else if(choice.equals("mul")) {
            System.out.println("Result: " + (a * b));
        } else if(choice.equals("div")) {
            if(b == 0) {
                System.out.println("Cannot divide by zero!");
            } else {
                System.out.println("Result: " + (a / b));
            }
        } else {
            System.out.println("Invalid choice!");
        }
        
    }
}
