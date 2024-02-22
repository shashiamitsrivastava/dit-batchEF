public class Recursion {
    // Infinite 
    static void show(int num){
        // Base Case / Termination Case
        if(num ==0){
            return ; 
        }
        System.out.println("Amit");
        show(num - 1);
    }

    /// Print My Name 5 Times Using Recursion
    public static void main(String[] args) {
        show(5);
    //     for(int i = 1; i<=5; i++){
    //    System.out.println("Amit");
    //     }
    }
}
