package algorithm.Integer;

public class DivideInteger{

    public static void main(String[] args){


        //System.out.println(divideInt2(Integer.parseInt(args[0])));
        System.out.println(divide(-7,-2));



    }


    //当除数是2的x次方时，可以用移位
    public static int divideInt2(int num){

        num = num >> 1;

        return num;
    }

    public static int divide(int dividend,int divisor){
        int result = 0;
        int flag = 2;

        if(dividend > 0){
            flag --;
            dividend = -dividend;
        }  

        if(divisor > 0){
            flag--;
            divisor = -divisor;
        }

        result = divideCore(dividend, divisor);

        return flag == 1 ? -result:result;
    }


    //负数不会溢出，所以统一转换成负数计算，每次减去大于被除数的一半但是小与被除数的2^n个除数，n就是商的一部分，直到被除数大于除数时结束循环
    public static int divideCore(int dividend,int divisor){
        int result = 0;

        while(dividend <= divisor){
            int value = divisor;
            int quotient = 1;
            while(dividend <= value + value){//两倍的value大于被除数时，value变为两倍
                value += value;
                quotient += quotient;
            }
            dividend -= value;
            result += quotient;
        }


        return result;  
    }




}