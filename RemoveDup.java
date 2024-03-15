public class RemoveDup {
    static String removeDup(String str){
        if(str.length()==1){
            return str;
        }
        if(str.charAt(0) == str.charAt(1)){
            return removeDup(str.substring(1));
        }
        else{
            return str.charAt(0) + removeDup(str.substring(1));
        }
    }
    public static void main(String[] args) {
        String str = "aaaabbbccddc";
        String r = removeDup(str);
        System.out.println(r);
    }
}
