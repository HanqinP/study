package Java.Object;

public class Main {

    public static void main(String[] args){

        Animal a = new Dog();
        Animal b = new Cat();

        fun(b);


    }

    //多态练习
    public static void fun(Animal someAnimal){
        if(someAnimal instanceof Dog){
            Dog d = (Dog)someAnimal;
            d.bark();
        }
        else if(someAnimal instanceof Cat){
            Cat cat = (Cat)someAnimal;
            cat.sleep();
        }
    }


}
