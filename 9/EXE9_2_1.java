public class EXE9_2_1 {
    public static void main(String [] args){
        SuperA sa = new SuperA();
        SubB sb = new SubB();

        //SubB繼承superA的v1變數與值
        System.out.println(sb.getV1());

        //SubB的v1變數開始有自己的值
        sb.setV1("data from sub");

        //SubB的v1變數開始有自己的值
        System.out.println(sb.getV1());

        //列印出SuperA的v1變數的值
        System.out.println(sa.getV1());
    }
}

class SuperA{
    private String v1 = "data from super";

    public void setV1(String a){v1 = a;}
    public String getV1(){return v1;}
}

class SubB extends SuperA{
    //public void md(){v1 = "I change it";}
}