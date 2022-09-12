package Java;

import java.util.Date;

public class FormatTest {
    public static void main(String[] args){
        String s = String.format("%,d", 100000000);//d暗示着参数2的类型，必须一致。%代表着参数2
        System.out.println(s);
        String f = String.format("%.2f", 2.4444444444444);
        System.out.println(f);
        String x = String.format("%x", 42);
        System.out.println(x);
        String c = String.format("%c", 70);
        System.out.println(c);

        System.out.println(String.format("%tc", new Date()));//周日 7月 03 22:38:22 CST 2022

        System.out.println(String.format("%tr", new Date()));//10:38:22 下午

        
    }
}
