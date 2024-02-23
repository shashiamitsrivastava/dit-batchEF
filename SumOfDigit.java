public class SumOfDigit {

    static int sumOfDigit(int num){
       // int sum =0;
        if(num==0){
            return 0; // Sum initialize
        }
        int sum = sumOfDigit(num/10);
        return sum + num %10;
    }
    public static void main(String[] args) {
        int r = sumOfDigit(123);    
        System.out.println(r);
        //sumOfDigit(123, 0);
    }
    // 123 
    static void sumOfDigit(int num, int sum){
        // Base Case
        if(num==0){
            System.out.println(sum);
            return ;
        }
        // Small Problem + Cycle
        sumOfDigit(num /10, sum + num%10);
    }
    // 123  = 1 + 2 + 3 = 6
   
}
