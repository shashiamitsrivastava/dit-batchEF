import java.util.Scanner;

public class Input2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = scanner.nextInt();
        System.out.println("Enter the second number");
        int b = scanner.nextInt();
        System.out.println(a+b);
       
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the third number");
        int c = s.nextInt();
        System.out.println(c);
        // System.out.println("Enter the id ");
        // int id = scanner.nextInt(); // 1001\n
        // scanner.nextLine(); // eat \n
        // System.out.println("Enter the Name");
        // String name = scanner.nextLine();
        
        // System.out.println("Name "+name);
        // System.out.println("id "+id);
        scanner.close();
        s.close();


    }
}
