public class MergeSort
{
	public static void main(String[] args)
	{
		int[] arr = new int[] {54,26,93,17,77,31,44,55,20};
		int[] tmp = new int[arr.length];
		mergeSort(arr, 0 , arr.length - 1, tmp);
		printarr(arr);
	}

	public static void mergeSort(int[] arr, int left, int right, int[] tmp)
	{
		if(left < right)
		{
			int mid = (left + right) / 2;
			mergeSort(arr, left, mid, tmp);
			mergeSort(arr, mid + 1, right, tmp);
			merge(arr, left, mid, right, tmp);
		}

	}

	public static void merge(int[] arr, int left, int mid, int right, int[] tmp)
	{
		int i = left;
		int j = mid;
		int m = mid + 1;
		int n = right;
		int k = 0;
		while(i <= j && m <= n)
		{
			if(arr[i] < arr[m])
				tmp[k++] = arr[i++];
			else
				tmp[k++] = arr[m++];
		}
		while(i <= j)
			tmp[k++] = arr[i++];
		while(m <= n)
			tmp[k++] = arr[m++];
		for(int p = 0; p < k; p++)
			arr[left + p] = tmp[p];
	
	}


	public static void printarr(int[] arr)
	{
		for(int i : arr)
			System.out.print(i + " ");
	}
}