public class ArraySorted {
    static boolean sorted(int arr[], int index){
        // Base Case
        
        if(arr.length-1 == index){
            return true;
        }
        // Negative Case
        if(arr[index]>arr[index + 1]){
            return false;
        }
        return sorted(arr, index+1);
    }
    public static void main(String[] args) {
        int arr[] = {10,20,130,40,50};
        if(arr.length==1){
            System.out.println("Sorted");
            return;
        }
        boolean r = sorted(arr, 0);
        System.out.println(r?"Sorted":"Not Sorted");
    }
}
