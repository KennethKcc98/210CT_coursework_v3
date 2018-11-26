import java.util.*;
public class QuickSort{
    static int [] sequence = {30,13,22,90};
    public static void main(String [ ] args) {
		qsort(0, sequence.length - 1);
	}

	private static void qsort(int left, int right) {
        int pivotIndex = left; //set first element as pivot
        int storeIndex = pivotIndex + 1;

        for (int i = pivotIndex + 1; i <= right; i++)
            if (sequence[i] < sequence[pivotIndex]) {
                swap(i, storeIndex);
                storeIndex++;
            }

        swap(pivotIndex, storeIndex - 1);
        printElement();
        
		//recursion
        if (storeIndex - 2 - left >= 1)
            qsort(left,storeIndex - 2);

        if (right - storeIndex >= 1)
            qsort(right,storeIndex );
	}

	private static void swap(int n1, int n2) {
		int tmp = sequence[n1];
        sequence[n1] = sequence[n2];
        sequence[n2] = tmp;
    }

    private static void printElement() {
		for (int i = 0; i < sequence.length; i++)
            System.out.print(sequence[i] + "  ");
        System.out.println("");
    }
}




