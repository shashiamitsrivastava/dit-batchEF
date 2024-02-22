public class RecExample2 {
    // 5 4 3 2 1 1 2 3 4 5
    /*
        5 to 1 Big Problem
        5 to 4 Small Problem
     * Think about small problem
     * Put the small problem in Cycle (Recursion)
     * To Stop the Cycle , Base Case / Termination Case
     */
    static void print(int num){
        // Termination Case
        if(num == 0){
            return ;
        }
        System.out.println(num);
        // small problem
        print(num-1);
        System.out.println(num);
    }
    public static void main(String[] args) {
        print(5);
    }

}
