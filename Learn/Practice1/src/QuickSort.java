import java.io.*;
import java.util.*;

public class QuickSort {
	public static void swap(int A[], int x, int y) {
		int temp = A[x];
		A[x] = A[y];
		A[y] = temp;
	}

	// Reorganizes the given list so all elements less than the first are
	// before it and all greater elements are after it.
	public static int partition(int A[], int f, int l) {
		int pivot = A[f];
		while (f < l) {
			if (A[f] == pivot || A[l] == pivot) {
				System.out.println("Only distinct integers allowed - C321");
				System.out.println("students should ignore this if statement");
			}
			while (A[f] < pivot)
				f++;
			while (A[l] > pivot)
				l--;
			swap(A, f, l);
		}
		return f;
	}

	public static void Quicksort(int A[], int f, int l) {
		if (f >= l)
			return;
		int pivot_index = partition(A, f, l);
		Quicksort(A, f, pivot_index);
		Quicksort(A, pivot_index + 1, l);
	}

	// Usage: java QuickSort [integer] ...
	// All integers must be distinct
	public static void main(String argv[]) {
		int A[] = {6, 5, 3, 1, 8, 7, 2, 4};


		Quicksort(A, 0, argv.length - 1);

		for (int i = 0; i < argv.length; i++)
			System.out.print(A[i] + " ");
		System.out.println();
	}
}