// import scanner
import java.util.Scanner;

// main class
class SearchIndex
  {
    // main method
    public static void main(String args[])
    {
	System.out.println("Testig something for Trynowlinks");
      // create an object for the scanner
      Scanner sc = new Scanner(System.in);
      // display the message
      System.out.println("enter size of the array: ");
      // store the length of the array;
      int len = sc.nextInt();
      // declare the array
      String[] arr = new String[len];
      // Store the elements in the array
      
      for(int i = 0; i < len; i++)
        {
         System.out.println("Enter the element : ");
          arr[i] = sc.next();
        }

      // store the target index in a variable
      System.out.println("enter search index position is: ");
      int index = sc.nextInt();

      // search the element using the target index value with all the array elements
      for(int i = 0; i < len; i++)
        {
          if(index == i)
          {
            System.out.println("The search index position " +index+ " is found as : " +arr[i]);
          }
        }
    }
  }