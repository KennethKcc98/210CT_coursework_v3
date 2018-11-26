import java.util.*;
class BinaryNode{
    int data;
    BinaryNode left;
    BinaryNode right;
    public BinaryNode(int d){
        data = d;
        left=right=null;
    }
    public int getData(){
        return data;
    }
}

class BinarySearch{
    BinaryNode root;
    private int arr[];
    private int key;

    public BinarySearch(){
        root = null;
    }
    public int binSearch(int arr[],int key){
        this.arr = arr;
        this.key = key;
        return (binSearchRecur(0, arr.length-1));
    }
    private int binSearchRecur(int min, int max) {
        int middle;
        if (min > max) return -1;
        middle = (min + max) /2;
        if(key == arr[middle]){
            return middle;
        }else if (key<arr[middle]){
            return binSearchRecur(min, middle-1);
        }else{
            return binSearchRecur(middle+1,max);
        }
    }

    public boolean isEmpty(){
        return root == null;
    }
    public BinaryNode search(BinaryNode t, int x){
        if(t == null){
            return null;
        }
        if(x<t.data){
            return search(t.left, x);
        }else if(x>t.data){
            return search(t.right, x);
        }else{
            return t;
        }
    }

    public void insert(int d){
        root = insertSubtree(root, d); 
    }
    
    private BinaryNode insertSubtree(BinaryNode t, int d){
        if(t == null){
            t = new BinaryNode(d);
        }else if(d<t.data){
            t.left=insertSubtree(t.left, d);
        }else if (d>t.data){
            t.right = insertSubtree(t.right, d);
        }
        return t;
    }

    private BinaryNode findMin(BinaryNode t){
        if (t == null){
            return null;
        }else if (t.left == null){
            return t;
        }else{
            return findMin(t.left);
        }
    }

    private BinaryNode findMax(BinaryNode t){
        if(t == null){
            return null;
        }else if(t.right == null){
            return t;
        }else{
            return findMax(t.right);
        }
    }
    private void visit(BinaryNode t) {
        System.out.print(Integer.toString(t.data)+" ");
    }


    public void inorder() {
        inorderSubtree(root);
        System.out.println();
    }
    private void inorderSubtree(BinaryNode t){
        if (t == null) return;
        inorderSubtree(t.left);
        visit(t);
        inorderSubtree(t.right);
    }
}