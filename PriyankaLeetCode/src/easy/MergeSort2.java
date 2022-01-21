package easy;

public class MergeSort2 {
	
	public static void main (String[] args)
	{
		int arr[] = new int[] {7,4,5,2,14,9,10,11,6,15};
		mergeSort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++)  
	    {  
	        System.out.println(arr[i]);  
	    }  
		
	}
	
	
	public static void mergeSort(int[] a, int first, int last) {
	    if(first == last) {
	        return;
	    }
	    int mid = (first+last) / 2;
	    int[] l = new int[mid];
	    int[] r = new int[last - mid];

	    for (int i = 0; i < mid; i++) {
	        l[i] = a[i];
	    }
	    for (int i = mid; i < last; i++) {
	        r[i - mid] = a[i];
	    }
	    mergeSort(l, first,mid);
	    mergeSort(r, mid+1, last);

	    merge(a, l, r, mid-first, last-mid);
	}
	
	
	public static void merge(
			  int[] a, int[] l, int[] r, int left, int right) {
			 
			    int i = 0, j = 0, k = 0;
			    while (i < left && j < right) {
			        if (l[i] <= r[j]) {
			            a[k++] = l[i++];
			        }
			        else {
			            a[k++] = r[j++];
			        }
			    }
			    while (i < left) {
			        a[k++] = l[i++];
			    }
			    while (j < right) {
			        a[k++] = r[j++];
			    }
			    System.out.println();
			}
}
