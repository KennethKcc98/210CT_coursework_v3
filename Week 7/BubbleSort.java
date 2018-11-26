//Q11(Advanced exercise)
/* 
    28 times comparisons
    In-place quick sort is more efficient
*/ 
public class BubbleSort {
	public static void main(String [] args) {
		int [] arr = {89,83,39,33,12,6,36,18,23};
		bubbleSort(arr);

		for (int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void bubbleSort(int [] array) {
		for (int pass=0; pass < array.length-1; pass++) 
			for (int i=0; i < array.length-pass-1; i++) 
				if (array [ i ] > array [ i+1 ])
					swap(array, i, i+1);	
	}

	public static void swap (int [ ] array, int first, int second) {
		int temp = array [ first ];
		array [ first ] = array [ second ];
        array [ second ] = temp;
        for (int i=0; i<array.length; i++)
            System.out.print(array[i] + " ");
            System.out.println();
    }
    
}
