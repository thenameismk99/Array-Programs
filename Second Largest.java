
//WAP to find Second Largest element in Array.
public class Main
{
  public static void main (String[]args)
  {
      int [] arr={6,8,9,4,7,1,3};
            // use for loop for traverse the Array
      for(int i=0;i<arr.length;i++)
      {
          for(int j=i+1;j<arr.length;j++)
          {
            if (arr[i]<arr[j])
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
          }
      }
      for(int i=0;i<arr.length;i++)
      {
        System.out.print(arr[i]+" ");
        
      }  
      System.out.println();
      System.out.print("Second Largest element " +arr[1]);
  }
}