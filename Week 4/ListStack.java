import java.util.*;
public class ListStack extends LinkedList{
    public ListStack() {    // <== constructor, different from ListStackComp.java
		super();
    }

	public boolean empty() {
	   if(isEmpty()){
		   return true;
	   }else{
		   return false;
	   }
	}

	public Object push(Object item) {
		addToTail(item);
		return item;
	}

	public Object pop() {
			Object item = removeFromHead();
			return item;
	}

	public Object peek() { 
			Object item = super.tail.getData();
			return item;
	}

	public int search(Object item) {
		ListNode current = head;
		int num=-1;
		for(int i = 0;i<length;i++){
			if(item.equals(current.getData())){
				num = i+1;//start from 0, so it should be +1 to fit the notes of search() 
				return num;
			}
			else{
				current = current.getNext();
			}		
        }
        return num;	
	}
}