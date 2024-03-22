public class RopeCut {
    static int maxCut(int ropeLen, int a, int b , int c){
        if(ropeLen ==0){
            return 0;
        }
        if(ropeLen<0){
            return -1;
        }
        int option1 = maxCut(ropeLen-a, a, b, c);
        int option2 = maxCut(ropeLen-b, a, b, c);
        int option3 = maxCut(ropeLen-c, a, b, c);
        int finalResult = Math.max(Math.max(option1, option2), option3);
        if(finalResult==-1){
            return -1;
        }
        return finalResult + 1;


    }
    public static void main(String[] args) {
        System.out.println(maxCut(5, 2, 5, 1));
    }
}
