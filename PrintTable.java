public class PrintTable {
    static String printTable2(int num, int val){
        // Base Case
        if(val == 0 ){
            return "";
        }
        // Small Problem
        String result = printTable2(num, val-1);
        String exp = num+"*"+val+"="+(num*val)+"\n";
        result = result + exp;
        return result;
    }
    public static void main(String[] args) {
        //printTable(5, 1);
        //printTable(5, 10);
        String r = printTable2(5, 10);
        System.out.println(r);
    }
    static void printTable(int num , int val){
        // Base Case
        // if(val>10){
            if(val ==0){
            return ; 
        }
        // System.out.println(num+"*"+val+"="+(num*val));
        // Small Problem
        //printTable(num, val+1);
        printTable(num, val-1);
        System.out.println(num+"*"+val+"="+(num*val));
    }
    
}
