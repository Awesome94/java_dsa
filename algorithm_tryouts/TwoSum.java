import java.lang.reflect.Array;
import java.util.*;

public class TwoSum{
    public static List findTwoSum(int[] arr, int target){
        Map map = new HashMap<>();
        List v =  new ArrayList();
        for(int x: arr){
            int num2 = target - x;
            if(map.containsKey(num2)){
                v.add(num2);
                v.add(x);
            }else{
                map.put(x, num2);
            };
        }
        return v;
    };
    public static void main(String[] args){
        int[] arr = {1,2,0,3,1};
        int tar = 2;
        System.out.println(findTwoSum(arr, tar));
    }
}