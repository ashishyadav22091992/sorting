package com.concerto;

public class InsertionSort {
	
	public void insertionSort(int [] arr) {
		
		int arrLength=arr.length;
		
		for(int i=1;i<arrLength;i++) {
			int key=arr[i];
			int j=i-1;
			
			while(j>=0 && arr[j]>key) {
				arr [j+1] = arr[j];
				j=j-1;
			}
			
			arr[j+1]=key;
		}
		
	}

}
