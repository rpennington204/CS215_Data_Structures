package pqsort;

import java.util.Arrays;

public class PQSortDriver {

	public static void main(String[] args) throws Exception{
		int[] arr1 = {1,10,8,6,5,3,15,12};
		int [] arr2 = {100,7,50,36,12,23,35};
		int [] isarr1 = Sorting.InsertSort(arr1);
		int [] isarr2 = Sorting.HeapSort(arr2);
		int [] hearr1 = Sorting.HeapSort(arr1);
		int [] hearr2 = Sorting.HeapSort(arr2);
		System.out.println(Arrays.toString(isarr1));
		System.out.println(Arrays.toString(isarr2));
		System.out.println(Arrays.toString(arr1));
		
		System.out.println("Heap sort:");
		System.out.println(Arrays.toString(hearr1));
		System.out.println(Arrays.toString(hearr2));
		
		

	}

}
