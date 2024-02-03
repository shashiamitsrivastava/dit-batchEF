import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) throws IOException {
       Scanner scanner = new Scanner(new File("/Users/amitsrivastava/Documents/dit-btech-2ndbatch-t-f-SectionEAndF/First.java"));
       // Scanner scanner = new Scanner("hello how are you\n hi \n ok \n");
       // nextXXX nextLine
       int count = 0;
       while(scanner.hasNextLine()){
        scanner.nextLine();
        count++;
        //System.out.println(scanner.next());
       }
    //    while(scanner.hasNext()){
    //     scanner.next();
    //     count++;
    //     //System.out.println(scanner.next());
    //    }
       System.out.println(count);
       scanner.close();
       // System.out.println("Enter the Name ");
        //int singleByte =  System.in.read();
        // byte b[] = System.in.readAllBytes();
        // System.out.println("NAme is "+b);
    }
}
