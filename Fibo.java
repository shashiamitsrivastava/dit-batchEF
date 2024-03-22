public class Fibo {

    static int fibo(int num){
        // Base case
        if(num<=1){
            return num;
        }
        // first term (num-1)
        // second term  (num-2)
        // third term = first term + second term
        int firstTerm = fibo(num-1);
        int secondTerm = fibo(num-2);
        int thirdTerm = firstTerm + secondTerm;
        return thirdTerm;
    }
    public static void main(String[] args) {
        System.out.println(fibo(8));
    }
}
