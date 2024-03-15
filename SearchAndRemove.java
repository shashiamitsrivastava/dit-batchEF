public class SearchAndRemove {
    static String searchAndRemove(String str, char search){
        if(str.length()==0){
            return "";
        }
        String result = searchAndRemove(str.substring(1), search);
        if(str.charAt(0)==search){
            return result;
        }
        else{
            return str.charAt(0) + result;
        }
    }
    public static void main(String[] args) {
        String result = searchAndRemove("Hello",
         'l');
        System.out.println(result);
    }
}
