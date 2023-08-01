import org.w3c.dom.Node;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class MyQueue implements Queue {

    private Node first;
    private Node last;
    private int num;

    public MyQueue(){
        this.first = null;
        this.last = null;
        num = 0;
    }

    @Override
    public int size() {
        return this.num;
    }

    @Override
    public boolean isEmpty() {
        return num==0;
    }

    @Override
    public boolean contains(Object o) {
        int n = 0;
        Node originFirst = this.first;

        while (n<this.num){
            if(this.first.getData()==o){
                this.first = originFirst;
                return true;
            }
            this.first = this.first.getNext();
            n++;
        }
        this.first = originFirst;
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        Node node = new Node();
        node.setData(o);
        if(this.first==null){
            this.first = node;
            this.last = node;

        }else{
            this.last.setNext(node);
            this.last = node;
        }
        this.num++;
        return true;
    }

    @Override
    public boolean remove(Object o) {

        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public boolean offer(Object o) {
        return false;
    }

    @Override
    public Object remove() {
        return null;
    }

    @Override
    public Object poll() {

        if(this.first == null) return null;

        Node node = this.first;
        this.first = this.first.getNext();
        node.setNext(null);
        num--;
        return node.getData();
    }

    @Override
    public Object element() {
        return null;
    }

    @Override
    public Object peek() {
        return null;
    }

    public class Node{
        private Object data;
        private Node next;

        public Object getData(){
            return this.data;
        }

        public void setData(Object o){
            this.data = o;
        }

        public Node getNext(){
            return next;
        }

        public void setNext(Node next){
            this.next = next;
        }
    }

}
