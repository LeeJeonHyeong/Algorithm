package ex_bubble_sort;

public class BubbleSort {
	
	public static void main(String[] args) {
		
		int arr[] = {40, 35, 24, 15, 25, 46, 67, 79};
		
		for (int j=arr.length ; j>0; j-- )  {
			for (int a = 0; a<arr.length-1; a++) {
				int cnt;
				if (arr[a]>arr[a+1]) {
					cnt = arr[a+1];
					arr[a+1] = arr[a];
					arr[a] = cnt;
				}
			}		
		}
		for (int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
