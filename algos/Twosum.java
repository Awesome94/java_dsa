import java.util.Arrays;
import java.util.HashMap;

public class Twosum{
    public static int[] findTwoSum(int[] arr, int target){
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int x = 0; x < arr.length; x++){
            map.put(arr[x], x);
        }
        for(int x=0; x<arr.length; x++){
            int complement = target-arr[x];
            if(map.containsKey(complement) && map.get(complement) != x){
                int[] results  = new int[] {x, map.get(complement)};
                System.out.println(Arrays.toString(results));
                return results; 
            };
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    public static void main(String[] arr){
        int[] arrays = {1,2,0,3,1};
        findTwoSum(arrays, 2);
    }
}
