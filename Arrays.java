// main class
class Arrays
  {
    // main method
    public static void main(String args[])
    {
	System.out.println("To test the git commands");
	System.out.println("One more Test1");
      // declare and initialize the array
      // Syntax 1
      // dt variable[size] = {v1, v2, ...};
      String colors[] = {"Blue", "Red", "Black", "Orange", "Yellow"};

      // for loop
      for(int i = 0; i <= colors.length-1 ; i++)
        {
          System.out.print(colors[i]+ ", ");
        }
      System.out.println();

      for(int i = colors.length - 1; i >= 0; i--) 
        {
          System.out.print(colors[i]+ ", ");
        }
    }
  }