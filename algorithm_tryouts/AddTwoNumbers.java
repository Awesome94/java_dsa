import java.util.*;

public class AddTwoNumbers{
    public static LinkedList add_two_number(LinkedList<Integer> L1, LinkedList<Integer> L2){
        LinkedList<Integer> L3  = new LinkedList();
        StringBuffer val1 = new StringBuffer();
        StringBuffer val2 = new StringBuffer();
        for(int x: L1){
            val1.insert(0, x);
        }
        for(int y: L2){
            val2.insert(0, y);
        }
        String[] value1 =  val1.toString().split(" ");
        String[] value2 =  val2.toString().split(" ");
        int sums = Integer.parseInt(value1[0]) + Integer.parseInt(value2[0]);

        String itersum = Integer.toString(sums);
        for(int c=0; c<itersum.length(); c++){
            char Lchar = itersum.charAt(c);
            int intLchar = Character.getNumericValue(Lchar);
            L3.add(intLchar);
        };
        System.out.println(L3.toString());
        return L3;
    }
    public static void main(String[] args){
        LinkedList List1 = new LinkedList();
        List1.add(2);
        List1.add(4);
        List1.add(3);

        LinkedList List2 = new LinkedList();
        List2.add(5);
        List2.add(6);
        List2.add(4);

        add_two_number(List1, List2);
    };  
};