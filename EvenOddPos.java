public class EvenOddPos {
   public static void main(String[] args) {
    int num = 8765;
    int pos = 0;
    int evenSum = 0;
    int oddSum = 0;
    while(num!=0){
        int digit = num % 10; // last digit
        pos++; // digit count
        if(pos%2==0){
            evenSum+=digit; // evenSum= evenSum + digit;
        }
        else{
            oddSum+=digit;
        }
        num/=10; // make number small
    }
    System.out.println(evenSum);
    System.out.println(oddSum);
   } 
}
