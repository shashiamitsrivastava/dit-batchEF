public class BoardDice {

    static void boardDice(int currentValue, int end
    , String result){
        // Base Case
        if(currentValue == end){
            System.out.print(result+" , ");
            return ;
        }
        if(currentValue > end){
            return ;
        }
        // boardDice(currentValue + 1, end, result + 1);
        // boardDice(currentValue + 2, end, result + 2);
        // boardDice(currentValue + 3, end, result + 3);
        // boardDice(currentValue + 4, end, result + 4);
        // boardDice(currentValue + 5, end, result + 5);
        // boardDice(currentValue + 6, end, result + 6);
       for(int dice = 1; dice<=6; dice++){
        boardDice(currentValue + dice, end, result + dice);
       }     
    }
    public static void main(String[] args) {
        boardDice(0, 10, "");
    }
}
