public class InsertSort{
	public static void main(String[] args)
	{
		int[] arr = new int[] {54, 26, 93, 17, 77, 31, 44, 55, 20};
        insertSort(arr);
        printarr(arr);
	}
	public static void insertSort(int[] arr)
	{
		for (int i = 1; i < arr.length; i++)
		{
			for (int j = i; j > 0; j--)
			{
				if(arr[j] < arr[j-1])
				{
					int tmp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = tmp;
				}
			}
		}
	}

	public static void printarr(int[] arr)
      {
            for(int i = 0; i < arr.length; i++)
            {
                  System.out.print(arr[i] + " ");
            }
      }
}