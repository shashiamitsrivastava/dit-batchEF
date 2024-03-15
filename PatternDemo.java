public class PatternDemo {
    static void printStar(int num){
        if(num==0){
            return ;
        }
        System.out.print("*");
        printStar(num-1);
    }
    static void printLine(int num){
        if(num==0){
            return ;
        }
        printStar(num);
        System.out.println();
        printLine(num-1);
       
       
       }

    public static void main(String[] args) {
        printLine(4);
    }
    
}
