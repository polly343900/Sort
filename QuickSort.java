public class QuickSort{
	public static void main(String[] args)
	{
		int[] arr = new int[] {54, 26, 93, 17, 77, 31, 44, 55, 20};
        quickSort(arr, 0, arr.length-1);
        printarr(arr);
	}
	public static void quickSort(int[] arr, int left, int right)
	{
		if(left < right)
		{
			int pivot = partition(arr, left, right);
			quickSort(arr, left, pivot-1);
			quickSort(arr, pivot+1, right);
  		}
  	}
	public static int partition(int[] arr, int left, int right)
	{
		int pivotvalue = arr[left];
		int leftmark = left + 1;
		int rightmark = right;
		while(leftmark < rightmark)
		{
			while(arr[leftmark] < pivotvalue)
				leftmark = leftmark + 1;
			while(arr[rightmark] > pivotvalue)
				rightmark = rightmark - 1;
			if(leftmark < rightmark)
			{
				int tmp = arr[rightmark];
				arr[rightmark] = arr[leftmark];
				arr[leftmark] = tmp;
			}
		}
		int tmp = arr[left];
		arr[left] = arr[rightmark];
		arr[rightmark] = tmp;
		return rightmark;
 
	}

	public static void printarr(int[] arr)
      {
            for(int i = 0; i < arr.length; i++)
            {
                  System.out.print(arr[i] + " ");
            }
      }
}