import java.util.*;
public class TestQueue{
    public static void main(String [] args){
        Queue q = new Queue();

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue("A");
        q.enqueue("B");
        q.enqueue("C");

        System.out.println(q);

        q.dequeue();

        System.out.println("Dequeue first: "+q);
    }
}