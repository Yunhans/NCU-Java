public class EXE9_2_2 {
    public static void main(String [] args){
        SuperA sa = new SuperA();
        SubB sb = new SubB();

        sa.ma();
        sb.ma();
    }
}

class SuperA{
    private void ma(){
        System.out.println("from super's ma()");
    }
}

class SubB extends SuperA{
    public void md(){

        //CANNOT inherit superclass's private method
        ma();
        super.ma();
    }
}