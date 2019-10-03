public class Animal{
    public void move(){
        Systsem.out.print("Animals can move");
    }

}
public class Dog extends Animal{
    public void move(){
        System.out.print("We move like dogs");
    }
    public static void main(String[] args){
        Animal a = new Animal();
        Dog b = new Dog(); 
        a.move();
        b.bark();
    }
}