
public class SelectionSort {
	int arr[] = {9,2,5,7,3};
	int len = 5;

	public static void main(String[] args) {
		SelectionSort s = new SelectionSort();
		s.display(5);
		System.out.println("Sorting");
		s.bSort(5);
		s.display(5);
	}
	
	public void bSort(int n) {
		for (int i=0; i<n-1; i++) {
			int min_ind = i;
			for (int j=i; j<n; j++) {
				if (arr[j]<arr[min_ind]) {
					min_ind=j;
				}
			}
			int temp=arr[min_ind];
			arr[min_ind]=arr[i];
			arr[i]=temp;
		}
	}
	
	public void display(int n) {
		for (int i=0; i<n; i++) {
			System.out.println(arr[i]);
		}
	}

}
