public class SearchReplaceString {
    static String searchAndReplace(String str){
       if(str.length()==0){
           return "";
       }
       if(str.charAt(0)=='h' && str.charAt(1)=='i'){
        return "Hello" + searchAndReplace(str.substring(2));
       }
       else{
        return str.charAt(0) + searchAndReplace(str.substring(1));
       }
       
      
   }
    public static void main(String[] args) {
        String str = "hi amit hi tim";
        String r = searchAndReplace(str);
        System.out.println(r);
    }
}
