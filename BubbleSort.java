public class BubbleSort
{
	public static void main(String[] args)
      {
            int[] arr = new int[] {54, 26, 93, 17, 77, 31, 44, 55, 20};
            bubblesort(arr);
            printarr(arr);
	
      }
      public static void bubblesort(int[] arr)
      {
            for(int i = arr.length-1; i > 0; i--)
            {
                  for(int j = 0; j < i; j++)
                  {
                        if(arr[j] < arr[j+1])
                        {
                              int tmp = arr[j+1];
                              arr[j+1] = arr[j];
                              arr[j] = tmp;
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