
//WAP to find kth largest element in Array.
public class Main
{
  public static void main (String[]args)
  {
      int [] arr={6,8,9,4,7,5,15};
      int k=1;
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
            if(i==k-1)
            {
                System.out.print(k+" largest element is "+arr[i]);
            }
      }
    }
}