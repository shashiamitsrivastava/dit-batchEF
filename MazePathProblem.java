public class MazePathProblem {
    static void mazePath(int row, int col, int rowEnd,
     int colEnd, String result){

        // Base Case
        if(row == rowEnd && col == colEnd){
            System.out.println(result);
            return ;
        }
        if(row>rowEnd || col>colEnd){
            return ;
        }

        // Small problem (Right)
        mazePath(row, col+1, rowEnd, colEnd, result+"H");
        // Small problem (Down)
        mazePath(row+1, col, rowEnd, colEnd, result+"V");

    }
    public static void main(String[] args) {
        mazePath(0, 0, 2, 
        2, "");
    }
}
