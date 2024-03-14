public class Factorial {

    static int fact(int num){
        if(num == 1){
            return 1;
        }
        int result = fact(num-1);
        return result * num;
    }
   
    static void fact(int num, int result){
       
        // Base Case / Termination Case
        // One time code
        if(num ==1){
            System.out.println("Fact Result "+result);
            return ; // exit from the current function call
        }

        // Big Problem 5! n!
        // Small Problem  n-1 (recursion)
        // N time
        fact(num-1, result * num); // Cycle (Loop)
    }
    public static void main(String[] args) {
        // 5 - 5 * 4 * 3 * 2 * 1
        //fact(5, 1);
        System.out.println(fact(5));
    }
}
