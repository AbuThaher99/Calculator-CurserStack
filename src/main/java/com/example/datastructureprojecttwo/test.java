package com.example.datastructureprojecttwo;

public class test {
	public static void main(String[] args) {
		
		Comparable a[] = {2,5,6,7,1,9,58,6,9};
		sort(a);
		for(int i =0 ; i<a.length ; i++) {
			System.out.print(a[i].toString()+" ");
		}
	}
	public static void sort(Comparable[] arr) {
		int n = arr.length - 1;
		for (int i = arr.length / 2; i >= 0; i--)
			sink(arr, i, n);

		while (n > 0) {
			exchange(arr, 0, n);
			sink(arr, 0, --n);
		}
	}

	private static void sink(Comparable[] arr, int i, int n) {
		while (i * 2 + 1 <= n) {
			int k = i * 2 + 1;
			if (k + 1 < n && less(arr, k, k + 1))
				k++;

			if (less(arr, i, k))
				exchange(arr, i, k);
			i = k;
		}
	}

	private static void exchange(Comparable[] arr, int i, int k) {
		Comparable d = arr[i];
		arr[i] = arr[k];
		arr[k] = d;
	}

	private static boolean less(Comparable[] arr, int k, int i) {
		return arr[k].compareTo(arr[i]) < 0;
	}
	
	
	
	
}
