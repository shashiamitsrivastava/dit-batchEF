public class ArraySearch {
    static int searchElementOccur(int arr[], int search, 
    int index){
        if(arr.length== index){
            return 0;
        }
        int count = searchElementOccur(arr, search, index+1);
        if(arr[index]==search){
            count++;
        }
        return count;
    }
    static boolean searchElement(int arr[], int search, int index){
        if(arr.length == index){
            return false;
        }
        if(arr[index] == search){
            return true;
        }
        return searchElement(arr, search, index+1);
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,40,100,40,100};
        int search = 150;
        System.out.println(searchElementOccur(arr, search, 0));
        // System.out.println( searchElement(arr, search, 0)
        // ?"Found":"Not Found");

       
    }
}
