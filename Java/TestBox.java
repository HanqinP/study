package Java;

public class TestBox {
    Integer i;
    int j;
    public static void main(String[] args){
        TestBox t = new TestBox();
        t.go();
    }

  
    public void go(){
        j=i;  //这里j会有默认值0，但是i是integer类型，不会有默认值，所以为null，此行会报错
        System.out.println(j);
        System.out.println(i);
    }
}
