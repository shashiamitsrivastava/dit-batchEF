public class StringReverse {
    static String reverse(String str){
        // Base case
        if(str.length()==0){
            return "";
        }
        String smallString = reverse(str.
        substring(1));
        return smallString + str.charAt(0);
    }
    public static void main(String[] args) {
        String name = "tim";
       String rev =  reverse(name);
       System.out.println(rev);
    }
}
