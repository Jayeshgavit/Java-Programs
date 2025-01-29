public class Main {

    public static void main(String[] args) {
    Complex obj = new Complex();   //Defualt constructor
    obj.a=4;
    obj.b=5;

    obj.print();
    }
}

class Complex{
    int a,b;

    void print(){
        System.out.println(a+ " + " + b + "i");
    }
}