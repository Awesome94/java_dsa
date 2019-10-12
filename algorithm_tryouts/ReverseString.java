import java.util.*;

public class ReverseString{
    public static String reverse_string(String str){
        StringBuilder reversed_string = new StringBuilder("");
        String[] strList = str.split(" ");
        for(int s = 0; s<strList.length; s++){
            StringBuilder c = new StringBuilder(strList[s]);
            strList[s] = new String(c.reverse());
        }
        for(String x: strList){
            reversed_string.append(x+" ");
        }
        return new String(reversed_string);
    }
    public static void main(String[] args){
        String str = "geeks for geeks";
        System.out.println(reverse_string(str));
    }
};
