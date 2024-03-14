public class ArraySearchDemo {
    static int[] findOccurHelper(int arr[], int search , int index, int count){
        if(arr.length==index){
            int result [] = new int[count];
            return result;
        }
        if(arr[index]==search){
            count++;
        }
        int[] r = findOccurHelper(arr, search , index + 1, count);
        if(arr[index]==search){
            r[count-1] = index;
        }
        return r;
    }
    static int[] findOccur(int arr[], int search , int index){
        return findOccurHelper(arr, search , index, 0);
    }
  public static void main(String[] args) {
    int arr[] = {10,20,30,50, 40,50,60,50,100};
    int search = 50;
    int indexes[] = findOccur(arr, search, 0);
    for(int index : indexes){
        System.out.println(index);
    }

  }  
}
