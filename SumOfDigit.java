public class SumOfDigit {

    int sumOfDigit(int num){
        return 0;
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
    public static void main(String[] args) {
            sumOfDigit(123, 0);
    }
}
