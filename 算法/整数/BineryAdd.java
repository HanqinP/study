package 算法.整数;

public class BineryAdd {
    public static void main(String[] args){
        System.out.println(bineryAdd("01", "11"));
    }


    public static String bineryAdd(String num1,String num2){
        StringBuilder stringBuilder = new StringBuilder();//结果可变切频繁，所以用StringBuilder

        int i = num1.length()-1;
        int j = num2.length()-1;
        int carry = 0;

        while(i >= 0 || j >= 0){

            int digitalA = i >=0 ? num1.charAt(i--) - '0' : 0; // char x - '0' 返回对应的整型数字
            int digitalB = j >=0 ? num2.charAt(j--) - '0' : 0;
            int sum = digitalA+digitalB+carry;
            carry = sum>=2? 1:0;
            sum = sum >=2 ? sum-2 : 0;
            stringBuilder.append(sum);

        }

        if (carry == 1) {
            stringBuilder.append(1);
        }
        stringBuilder.reverse();//字符串反转
        String result = stringBuilder.toString();
        
        return result;

    }



}
