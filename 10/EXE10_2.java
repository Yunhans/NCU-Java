public class EXE10_2 {
    public static void main(String [] args){
        Animal a = new Bird();
        a.move();
        //a[0].layEgg();
        a = new Dog();
        a.move();
    }
}

abstract class Animal{
    public abstract void move();
}

class Bird extends Animal{
    public void move(){
        System.out.println("I fly");
    }

    public void layEgg(){
        System.out.println("I lay eggs");
    }
}

class Dog extends Animal{
    public void move(){
        System.out.println("I walk and run");
    }
}