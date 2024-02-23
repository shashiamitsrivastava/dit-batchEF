public class PrimeNumberRec {
    static boolean prime2(int num, int divide){
        if(num==divide){
            
            return  true;
        }
        if(num % divide ==0){
            
            return false;
        }
        return prime2(num , divide + 1);
    }

    static void prime(int num, int divide){
        if(num==divide){
            System.out.println("Prime Number");
            return ;
        }
        if(num % divide ==0){
            System.out.println("Not a Prime Number");
            return;
        }
        prime(num , divide + 1);
    }
    public static void main(String[] args) {
        //prime(27, 2);
        System.out.println(prime2(17,2)
        ?"Prime Number":"Not Prime Number");
        
    }
}
