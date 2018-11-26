class ListNode {
	Object data;
	ListNode next;
	ListNode(Object o) { data = o; next = null; }
	ListNode(Object o, ListNode nextNode) 
		{ data = o; next = nextNode; }
	Object getData() { return data; }
	ListNode getNext() { return next; }
} // class ListNode

class EmptyListException extends RuntimeException {
	public EmptyListException () { super ("List is empty"); }
} // class EmptyListException

class LinkedListQ4 {
	private ListNode head;
	private ListNode tail;
	public LinkedListQ4() { head = tail = null; }
	public boolean isEmpty() { return head == null; }
	public void addToHead(Object item) {
		if(isEmpty()){
			head=tail= new ListNode(item);
		}else{
			head=new ListNode(item, head);
		}
	}
	public void addToTail(Object item) {
		if(isEmpty()){
			head=tail= new ListNode(item);
		}else {
				tail=tail.next =new ListNode(item);
			}	
	}
	public Object removeFromHead() throws EmptyListException {
		Object item = null;
		if (isEmpty())
			throw new EmptyListException();
			item = head.data;
		if(head==tail){
			head=tail=null;
		}else {
			head=head.next;
			
		}
		return item;
			
	}
	public Object removeFromTail() throws EmptyListException {
		Object item = null;
		if (isEmpty()) 
			throw new   EmptyListException();
		item =tail.data;
		if (head==tail)
		head=tail=null;
		else{
			ListNode current =head;
			while(current.next!=tail)
				current=current.next;
				tail=current;
		}
		return item;
  }
    
	
	public String toString () {
		String s = "[ ";
		ListNode current = head;
		while (current != null) {
			s += current.data + " ";
			current = current.next;
		}
		return s + "]";
	}
} // class LinkedList
