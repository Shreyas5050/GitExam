package SortingAlgoriths;

public class BubbleSort 
{
public static void main(String[]args) 
{
  int[] arr = {11,45,17,18,100,25,69};
  System.out.println("Before Sorting:");
  printArr(arr);
 package SortingAlgoriths;

public class BubbleSort 
{
public static void main(String[]args) 
{
  int[] arr = {11,45,17,18,100,25,69};
  System.out.println("Before Sorting:");
  printArr(arr);
  
  bubbleSort(arr);
  System.out.println("After Sorting:");
  printArr(arr);
}
static void bubbleSort(int[] arr) 
{
  for(int i=0;i<arr.length-1;i++)
  {
    for(int j=0;j<arr.length-1;j++)
    {
      if(arr[j]>arr[j+1])
      {
        int temp=arr[j];
        arr[j]=arr[j+1];
        arr[j+1]=temp;
      }
    }
  }
}
static void printArr(int[] arr)
{
  for(int i:arr)
  {
    System.out.print(i+" ");
  }
  System.out.println();
}
} 
  bubbleSort(arr);
  System.out.println("After Sorting:");
  printArr(arr);
}
static void bubbleSort(int[] arr) 
{
  for(int i=0;i<arr.length-1;i++)
  {
    for(int j=0;j<arr.length-1;j++)
    {
      if(arr[j]>arr[j+1])
      {
        int temp=arr[j];
        arr[j]=arr[j+1];
        arr[j+1]=temp;
      }
    }
  }
}
static void printArr(int[] arr)
{
  for(int i:arr)
  {
    System.out.print(i+" ");
  }
  System.out.println();
}
}