import java.util.*;
public class Queue extends LinkedList{
    
    public Queue() { 
        super();
    }

    public boolean empty(){ 
        return head == null; 
    }

    public void enqueue(Object item){
        // System.out.println(item);

        addToTail(item);
        // System.out.println("head/"+super.head.getData());
    }

    public Object dequeue(){
        //Object item = null;
        return    removeFromHead();
    }
    public String toString(){
        String str = "[ ";
		ListNode current = head;
		while (current != null) {
			str = str + current.getData() + " ";
			current = current.getNext();
		}
		return str + " ]";
	}
}