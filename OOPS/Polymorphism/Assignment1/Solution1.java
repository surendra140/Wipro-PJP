class Fruit {
    String name, taste, size;

    void eat()
    {
        System.out.println("Eating Fruits");
    }
}

class Apple extends Fruit {

    Apple() {
        name = "Apple";
        taste = "sweet anf caramelized";
    }

    @Override
    void eat(){
        System.out.println(name + " is " + taste + " in taste.");
    }
}

class Orange extends Fruit {

    Orange() {
        name = "Orange";
        taste = "sweet - tert";
    }

    @Override
    void eat(){
        System.out.println(name + " is "+ taste + " in taste.");
    }
}

public class Solution1 {
    
    public static void main(String[] args){
        Fruit fruit = new Fruit();
        Apple apple = new Apple();
        Orange orange = new Orange();

        fruit.eat();
        apple.eat();
        orange.eat();
    }
}
