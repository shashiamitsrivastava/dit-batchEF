public class Loops {
    public static void main(String[] args) {
        // for, while , do while , enhance for loop
        int num = 17;
        int count = 0;
        for(int i =2 ; i*i<=num ; i++){
            if(num % i ==0){
               System.out.println("Not a Prime Number");
               return ; 
            }
        }
        System.out.println("Prime Number");
        // for(int i =2 ; i<=Math.sqrt(num) ; i++){
        //     if(num % i ==0){
        //        System.out.println("Not a Prime Number");
        //        return ; 
        //     }
        // }
        // System.out.println("Prime Number");

        // for(int i =2 ; i<num ; i++){
        //     if(num % i ==0){
        //        System.out.println("Not a Prime Number");
        //        return ; 
        //     }
        // }
        // System.out.println("Prime Number");
        //System.out.println(count==2?"Prime Number"
        //:"not a prime number");
        // for(int i =1 ; i<=num ; i++){
        //     if(num % i ==0){
        //         count++;
        //     }
        // }
        // System.out.println(count==2?"Prime Number"
        // :"not a prime number");
    }
}
