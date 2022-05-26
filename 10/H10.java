public class H10 {
    public static void main(String [] args){
        A a = new A();
        B b = a;
        C c = a;

        c.m2();
        //b.m3();
    }
}

abstract class C {
    public abstract void m1();
    public abstract void m2();
}

abstract class B extends C {
    public void m2(){
        System.out.println("B's m2()");
    }
}

class A extends B {
    public void m1(){
        System.out.println("A's m1");
    }
    public final void m3(){
        System.out.println("A's m3");
    }
}