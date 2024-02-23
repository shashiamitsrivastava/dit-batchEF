public class Sum {

    // static void show2(int i , int range, int sum){
    
    //     while(i>range){
    //         sum = sum + i;
    //     i = i + 1;
    //     }
    // }
    // static int sum = 0;
    static int show(int i, int range){
       
        if(i>range){
            return 0;
        }
        int sum = show(i+1, range);
        return sum + i;
    }
    static void show(int i, int range, int sum){
        if(i>range){
            System.out.println(sum);
            return ;
        }
        show(i+1, range, sum + i);
    }
    public static void main(String[] args) {
        // 1 to N Sum
        show(1, 10, 0);
    }
}
