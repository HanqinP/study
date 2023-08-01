import java.util.ArrayList;

public class MyQueue_arrayList {

    public int first;
    public int size;

    public ArrayList myQueue;

    public MyQueue_arrayList(){
        first = 0;
        myQueue = new ArrayList();
    }


    public boolean enQueue(Object o){
        myQueue.add(o);
        return true;
    }

    public boolean deQueue(){
        if(isEmpty()) return false;
        this.first++;
        return true;
    }

    public boolean isEmpty(){
        if(first>=myQueue.size()) return true;

        return false;
    }



}
