public class RotateANumber {
    public static void main(String[] args) {
        int num = 12345;
        int r = 3;
        int cpy = num;
        int count = 0;
        while(cpy!=0){
            count++;
            cpy/=10;
        }
        int pow = (int)Math.pow(10,r);
        int rightSide = num % pow;
        //System.out.println(rightSide);
        int leftSide = num/pow;
        //System.out.println(leftSide);
        int d = count - r;
        int result = rightSide * (int)Math.pow(10, d) + leftSide;
        System.out.println(result);
        
    }
}
