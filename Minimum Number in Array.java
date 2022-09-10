
//WAP to find Minimum Number in Array.
public class Main
{
  public static void main (String[]args)
  {
      int [] arr={5,6,8,9,4,7};
      int min=arr[0];
      // use for loop for traverse the Array
      for(int i=0;i<arr.length;i++)
      {
          if(arr[i]>min)
          {
              min=arr[i];
          }
      }
    System.out.println ("Minimum Number "+ min);
  }  
}