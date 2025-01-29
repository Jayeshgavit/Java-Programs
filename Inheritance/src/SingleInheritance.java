class Animal{
    void eat(){
        System.out.println("Eating..!");
    }
    void sleep(){
        System.out.println("Sleeping..!");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Barking..!");
    }
}
public class SingleInheritance {
    public static void main(String[] args) {
        Dog dobj = new Dog();
        dobj.eat();
        dobj.sleep();
        dobj.bark();
    }
}
