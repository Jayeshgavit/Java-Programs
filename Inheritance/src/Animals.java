public class Animals {

    void eat(){
        System.out.println("Eating");
    }
    void sleep(){
        System.out.println("Sleeping");
    }

    public static void main(String[] args) {
        cat c = new cat();
        c.eat();
        c.sleep();
        c.meow();
//        c.bark();    it is not possible because method is present in Dog and cat acnnot access
    }
}

class Dogs1 extends Animals {
    void bark(){
        System.out.println("Barking");
    }
}

class cat extends Animals {
    void meow(){
        System.out.println("meowing..!");
    }
}