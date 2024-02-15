public class FlipDigit {
    public static void main(String[] args) {
        int num = 32145;
        int pos = 0;
        int sum = 0;
        while(num!=0){
            int digit = num % 10;
            pos++;
          sum += pos *  (int)Math.pow(10, digit-1);
          num/=10;
        }
        System.out.println(sum);
    }
}
