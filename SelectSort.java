public class SelectSort{
	public static void main(String[] args)
	{
		int[] arr = new int[] {54, 26, 93, 17, 77, 31, 44, 55, 20};
        selectSort(arr);
        printarr(arr);
	}
	public static void selectSort(int[] arr)
	{
		for(int i = arr.length - 1; i > 0; i--)
		{
			int maxposition = 0;
			for(int j = 1; j <= i; j++)
			{
				if(arr[j] > arr[maxposition])
					maxposition = j;
			}
			int tmp = arr[i];
			arr[i] = arr[maxposition];
			arr[maxposition] = tmp;
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