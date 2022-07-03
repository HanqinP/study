package Java.Object;

public class Dog extends Animal{

    public Dog(){
        age = 2;
        location = "Canada";
        super.sleep();
    }

    public void bark(){
        System.out.println("wow!!!!");
    }
}
