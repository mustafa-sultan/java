// Java Program to input ten numbers from the keyboard and then print the sum.
// Written By: Mustafa Alaa
// Date: 12/11/2014

public class pg45
{
  public static void main (Strin[] args)
  {
    Scanner = input = new Scanner (System.in); // scanner
    
    int i; // for loop variable
    sum = 0; // total variable
    int current_input; // for loop input variable
    
    for (i = 1; i <= 10; i++)
    {
      System.out.println("Please enter number" + i  + "and press return: ");
      current_input = input.nextInt();
      sum += current_input
    }
     System.out.println("sum = " + sum);
  } // end main
} // end clas pg45
