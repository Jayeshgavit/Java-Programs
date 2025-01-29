public class Main {
    public static void main(String[] args) {
        Greet obj = new Greet();
        obj.greet();

        obj.greet("Anush");
    }
}


class Greet{

    void greet(){
        System.out.println("Hello");
    }

    void greet(String name){
        System.out.println("Hello " + name + " Good morning..!");
    }
}