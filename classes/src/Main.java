public class Main {



    public static void main(String[] args) {
        System.out.println("Hello world!");

        Dog d1 = new Dog();
        //poperties
        d1.name = "Khandu";
        d1.walk();
        d1.eat();

        Dog d2 = new Dog();
        d2.name = "Tommy";
        d2.walk();
        d2.eat();

        Cat c1 = new Cat();
        c1.run();

        Complex printobj = new Complex();
        printobj.a= 25;
        printobj.b= 5;
        printobj.print();
    }
}

class Dog{

    //followings are properties
    String name;
    int age;
    String color;


    // Below is we are defining behaviours
    void walk(){
        System.out.println(name+ " is walking ");
    }
    void eat(){
        System.out.println(name+"is eating ");
    }

    void sleep(){
        System.out.println("is sleeping ");
    }

}

class Complex{
    int a,b;

    void print(){
        System.out.println(a+ " + " + b + "i");
    }
}

class Cat{

    void run(){
        System.out.println("cat is running ");
    }

}

//there is only one public class which is main