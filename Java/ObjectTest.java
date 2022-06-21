package Java;

public class ObjectTest {
    public static void main(String[] args){

    byteObjectTest();
    intObjTest();        

    }



    //byte 对象只有1byte，所以-128~127，当值为字符时，他保存的其实是ascci码的对应值。因为Ascci码刚好8bit的大小
    public static void byteObjectTest(){

        //byte
        byte byteNum = 7;
        byte byteChar = 'a';//byte
        System.out.println(byteNum);
        System.out.println(byteChar);



    }

    //int 同上的byte
    public static void intObjTest(){
        int a = 1;
        int b = 'a';
        System.out.println(a);
        System.out.println(b);
    }


    //array[]
    public static void arrayObjectTest(){
        //该数组变量只存引用
        DogObj[] dogs;
        //现在有个长度是7的数组，存的都是DogObj类型的引用地址，但这些引用地址现在还没有关联任何一个DogObj对象
        dogs = new DogObj[7];



    }



    public class DogObj{
    
        String name;

        public void foo(){System.out.println("I am a dog");}

    }

}


