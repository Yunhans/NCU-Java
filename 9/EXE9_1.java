public class EXE9_1 {
    public static void main (String [] args){
        Son s = new Son();
        s.habit();
    }
}

class Father {
    public void habit(){
        System.out.println("I like fishing");
    }
}

class Son extends Father {
    public void habit(){
        System.out.println("I like racing");
        super.habit();
    }
}