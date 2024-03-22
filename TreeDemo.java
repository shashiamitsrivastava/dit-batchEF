public class TreeDemo {

    static void fun(int num){
        if(num<=0){
            return ;
        }
        System.out.println("num-1 build "+num);
        fun(num-1);
        System.out.println("num-1 fall "+num);
        fun(num-2);
        System.out.println("num-2 fall "+num);
    }
    public static void main(String[] args) {
        fun(3);
    }
}
