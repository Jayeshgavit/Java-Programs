class Animal1{
    void eat(){
        System.out.println("Eating");
    }
}
class Dogs extends Animal1{
    void bark(){
        System.out.println("Barking..!");
    }
}
class babyDod extends Dogs{
    void weep(){
        System.out.println("Weeping...");
    }
}

public class MultilevelInheritance {

    public static void main(String[] args) {
        babyDod bd = new babyDod();
        bd.eat();
        bd.weep();
        bd.bark();
    }
}
