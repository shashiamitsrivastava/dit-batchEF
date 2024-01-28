import java.io.FileNotFoundException;
import java.io.PrintStream;

class Second{

    public static void main(){
        System.out.println("no args main");
    }
    public static void main(int x){
        System.out.println("int args main");
    }
    static public  void main(String ...a){
        main();
        main(10);
        try {
            System.setOut(new PrintStream("/Users/amitsrivastava/Documents/dit-btech-2ndbatch-t-f/output.txt"));
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Hello Java");
       // System.out.print();

    }
}