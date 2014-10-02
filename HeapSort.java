	public class HeapSort
	{
		public static void main(String[] args)
		{
			int[] arr = new int[] {55,26,93,17,77,31,44,55,20};
			heapBuild(arr, 0, arr.length);
			heapSort(arr, arr.length);
			printarr(arr);
	
		}
	
		public static void heapBuild(int[] arr, int index, int length)
		{
			for(int i = index; i < length/2; i++)
			{
				int leftchild = 2*i + 1;
				int rightchild = 2*i + 2;
				if(arr[leftchild] >= arr[rightchild])
			    {
					if(arr[i] < arr[leftchild])
					{
						int tmp = arr[i];
						arr[i] = arr[leftchild];
						arr[leftchild] = tmp;
					}
				}
				else if(arr[leftchild] < arr[rightchild])
				{
					if(arr[i] < arr[rightchild])
					{
						int tmp = arr[i];
						arr[i] = arr[rightchild];
						arr[rightchild] = tmp;
					}
				}
			}

		}
	
		public static void heapSort(int[] arr, int length)
		{
			for(int i = length - 1; i > 1; i--)
			{
				int tmp = arr[i];
				arr[i] = arr[0];
				arr[0] = tmp;
				heapBuild(arr, 0, i-1);
			}
	
		}
	
		public static void printarr(int[] arr)
		{
			for(int i : arr)
				System.out.print(i + " ");
		}
	}
