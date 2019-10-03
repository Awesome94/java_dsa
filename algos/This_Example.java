public class This_Example{
    public static void main(String[] args){
        // Instantiating the class
        This_Example obj1 = new This_Example();

        // Invoking the print method
        obj1.print();

        //passing the new value to the num variable through parametized constructor
        This_Example obj2  = new This_Example(30);
        //invoking the print method again
        obj2.print();
        varArgs(1,3,4,52,123,5);
        double[] awesome = {1,2,34,2,1};
        varArgs(new double[]{1,2,3});
        varArgs(awesome);
    }

    int num = 10; //instance variable num

    This_Example(){
        System.out.println("This is an example program on keyword this");
    }
    This_Example(int num){
        // invoking the default constructor
        this();
        //Assigning local variable to instance variable num
        this.num = num;

    }
    public void greet(){
        System.out.println("Welcome to Davocorp tutorials");
    }
    public void print(){
        //local variable num
        int num  = 20;

        //printing local variable
        System.out.println("Value of local variable is " +num);
        //Print the instance variable
        System.out.println("Value of instance variable is:" +this.num);
        //invoking the greet method of class 
        this.greet();
    }
    public static void varArgs(double... numbers){
        if(numbers.length == 0){
            System.out.println("No argument passed");
            return;
        }
        double result = numbers[0];
        for(int i = 1; i < numbers.length; i++)
        if(numbers[i]> result) result = numbers[i];
        System.out.println("The max value is"+result);
    }

}