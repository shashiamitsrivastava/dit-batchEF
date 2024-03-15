public class Tree {
    static void fun(int x){
        if(x<0){
            return ;
        }
        System.out.println(x);
        fun(x-1);
        fun(x-2);
        fun(x-3);
    }
    public static void main(String[] args) {
        fun(3);
    }
}
