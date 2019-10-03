class Outer_demo{
    int num;
    
    private class Inner_demo{
        public void print(){
            System.out.println("this is an inner class");
        }
    }
    //Accessing inner class from outer method within
    void display_inner(){
        Inner_demo inner = new Inner_demo();
        inner.print();
    }
}

public class NestedClasses{
    public static void main(String[] args){
        Outer_demo outer = new Outer_demo();
        outer.display_inner();
    }
};