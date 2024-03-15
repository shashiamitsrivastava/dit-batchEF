public class SearchAndReplaceInString {
    static String searchAndReplace(String str, char search,
     char replace){
        if(str.length()==0){
            return "";
        }
        String result = searchAndReplace(str.substring(1), search, replace);
        if(str.charAt(0) == search){
            return replace + result;
        }
        else{
           return str.charAt(0) + result;
        }
    }
    public static void main(String[] args) {
        String str = "Hello";
        char search = 'l';
        char replace = 'x';
        String result= searchAndReplace(str, search, replace);
        System.out.println(result);
    }
}
