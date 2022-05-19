public class EXE9_3 {
    public static void main(String [] args){
        Sub1 s1 = new Sub1();
        Sub2 s2 = new Sub2();
    }
}

class Super{
    public Super(){
        methodA();
    }
    public void methodA(){
        System.out.println("from super");
    }
}

class Sub1 extends Super{
    public Sub1(){
        methodB();
    }
    public void methodB(){
        System.out.println("from sub1\n");
    }
}

class Sub2 extends Super{
    public void methodB(){
        System.out.println("from sub2");
    }
}
