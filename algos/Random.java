public class Random{

    public void AbtArrays(){
        double[] myList = new double[10];
        double[] myLists = {1,2,3,4,3};
        System.out.println(myList);
        System.out.println(myLists);
    }

    public static void TestArrays(){
        double[] myList = {1.9, 2.9, 3.4, 3.5};

// print all elements in the array
        for(int i = 0; i<myList.length; i++){
            System.out.println(myList[i] + " ");
        }
// suming all elements 
        double total = 0;
        for(int x = 0; x<myList.length; x++){
            total+=myList[x];
        }
        System.out.println(total);
// finding the max element
        double max = 0;
        for(int z=0; z < myList.length; z++){
            if(myList[z] > max) max = myList[z];
        }
    }
    protected void finalize(){
        //finalize code goes here. 
    }
    public static void main(String[] args){
        StringBuffer a = new StringBuffer("this is it");
        StringBuilder c = new StringBuilder("this is c");
        a.append("awesome");
        int flostVal = 12;
        String uniqueVal = "unik";
        String fs;
        fs = String.format(" %d is the float value and %s is the unique value %s", flostVal, uniqueVal, a);
        System.out.println(fs);
        System.out.println(a.reverse());
    }
}