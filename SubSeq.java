public class SubSeq {

    static void generateSubSeq(String str, String result){
        // Base case
        if(str.length()==0){
            System.out.print(result+" , ");
            return ;
        }
        // Not Take it
        generateSubSeq(str.substring(1), result);
        // Take It
        generateSubSeq(str.substring(1), result + str.charAt(0));
    }
    public static void main(String[] args) {
        generateSubSeq("amit", "");
    }
}
