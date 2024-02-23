public class PalindromeNumber {
    // static boolean pn2(int num , int reverse){
        
    // }

    static void pn(int num , int reverse, int temp){
        if(temp ==0){
            System.out.println(num == reverse
            ?"Palindrome Number":"Not Palindrome");
            return ;
        }
        int digit = temp % 10;
        pn(num, reverse * 10 + digit, temp/10);
    }
    public static void main(String[] args) {
        int x = 123;
        pn(x, 0, x);
    }
}
