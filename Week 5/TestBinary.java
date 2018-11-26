import java.util.*;
class TestBinary{
    public static void main(String [] args) {
        BinarySearch tree = new BinarySearch();
        int data=0;
        for(int i=0;i<10;i++){
            data =(int) i;
            tree.insert(data);
        }

        System.out.println("This is print in ascending order: ");
        tree.inorder();
    }
}