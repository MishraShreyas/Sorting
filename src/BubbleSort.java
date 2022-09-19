
public class BubbleSort {
	int arr[] = {9,2,5,7,3};
	int len = 5;

	public static void main(String[] args) {
		BubbleSort b = new BubbleSort();
		b.display(5);
		System.out.println("Sorting");
		b.bSort(5);
		b.display(5);
	}
	
	public void bSort(int n) {
		for (int i=0; i<n-1; i++) {
			for (int j=0; j<n-i-1; j++) {
				if (arr[j]>arr[j+1]) {
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	
	public void display(int n) {
		for (int i=0; i<n; i++) {
			System.out.println(arr[i]);
		}
	}

}
