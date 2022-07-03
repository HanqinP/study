package Java.Object;

public class Cat extends Animal{

    public Cat(){
        age = 1;
        location = "shanghai";
    }

    @Override
    public void sleep(){
        System.out.println("cat overrided sleep method");

    }

    public void getAge(){
        System.out.println(age);
    }
}
