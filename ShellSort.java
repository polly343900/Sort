//import InsertSort;

public class ShellSort
{
	public static void main(String[] args)
	{
		int[] arr = new int[] {77, 26, 93, 17, 77, 31, 44, 55, 20};
		shellSort(arr);
	//	InsertSort.insertSort(arr);
		printarr(arr);
	}

	public static void shellSort(int[] arr)
	{
		int sublen = arr.length / 2;
		while(sublen > 0)
		{
			for(int i = 0; i < sublen; i++)
			{
				insertSort(arr, i, sublen);
			}	
			sublen = sublen / 2;
		}

	}

	public static void insertSort(int[] arr, int st, int inc)
	{
		for (int i = st + inc; i < arr.length; i = i+inc)
		{
			for (int j = i; j > st; j = j-inc)
			{
				if(arr[j] < arr[j-inc])
				{
					int tmp = arr[j];
					arr[j] = arr[j-inc];
					arr[j-inc] = tmp;
				}
			}
		}

	}

	public static void printarr(int[] arr)
	{
		for(int i:arr)
			System.out.print(i + " ");
	}
}