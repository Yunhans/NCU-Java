public class EXE9_2_3 {
    public static void main(String [] args){
        SubB sb = new SubB();
        sb.mb();
    }
}

class SuperA{
    protected String v1 = "from super's protected v1";
    protected void ma(){ 
        System.out.println("from super's protected ma()"); 
    }

    public void setV1(String a){ v1 = a; }
    public String getV1(){ return v1; }
}

class SubB extends SuperA{
    public void mb(){
        v1 = "I change it";
        System.out.println(v1);
        ma();
    }
    
}