public class EXE10_3 {
    public static void main(String [] args){
        C c = new A();
        c.ma();
    }
}

abstract class C{
    public abstract void ma();
    public abstract void mb();
}

abstract class B extends C{
    public void ma(){
        System.out.println("ma from B");
    }
    public final void mc(){
        System.out.println("mc from B");
    }

}

class A extends B{
    public void mb(){
        System.out.println("mb from A");
    }
}