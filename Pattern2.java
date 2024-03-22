public class Pattern2 {
    static void printStar(int star){
        if(star == 0){
            return ;
        }
        System.out.print("*");
        printStar(star-1);
    }
    static void printLine(int lines){
        if(lines ==0 ){
            return ;
        }
        printLine(lines - 1);
        printStar(lines);
        System.out.println();
    }
    public static void main(String[] args) {
        printLine(5);
    }
}
