public class InsertionSort{
    static int[] insertion_sort(int[] arr){
        for(int x = 1; x<arr.length; x++){
            int j = x-1;
            int key = arr[x];
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j-=1;
            }
            arr[j+1] = key;
        }
        return arr;
    }
    public static void printArray(int[] arr){
        for(int z=0; z<arr.length; z++){
            System.out.println(arr[z] + " ");
        }
    }
    public static void main(String[] args){
        int[] arr = {12, 10, 22, 23, 25};
        insertion_sort(arr);
        printArray(arr);

    };
};