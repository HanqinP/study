package Java.SimpleGame;
import java.util.Scanner;

import Java.SimpleGame.SimpleDotCom;

public class Main {
    
    public static void main(String[] args){

        SimpleDotCom dotCom1 = new SimpleDotCom(7);
        Scanner scanner = new Scanner(System.in);;
        while(dotCom1.getHitNum()>0){

            System.out.println("请输入打击点：");
            if(dotCom1.checkHit(scanner.nextInt())){
                if(dotCom1.getHitNum()!=0){
                    System.out.println("hit！！！");;
                }else{
                    System.out.println("success!!");
                }
                
            }else{
                System.out.println("miss!!");
            }
            
        }
        


    }


}
