// Java Program
// Written By: Mustafa
// Date: 12/11/2014

public class pg125
{
  public static void main (String[] args)
  {
    Scanner input = new Scanner (System.in);
    
    int ohms;
    int farads;
    int volts;
    
    int time_0;
    int time_1;
    int time_2;
    int time_3;
    int time_4;
    int time_5;
    
    System.out.println("Enter the value of R in ohms and press return: ");
    ohms = input.nextInt();
    
    System.out.println("Enter the value of C in Farads and press return: ");
    farads = input.nextInt();
    
    System.out.println("Enter the value of Vs in Volts and press return: ");
    volts = input.nextInt();
    
    time_0 = volts * ( 1 - Math.exp(0 / (ohms*farads) ) );
    time_1 = volts * ( 1 - Math.exp(-1 / (ohms*farads) ) );
    time_2 = volts * ( 1 - Math.exp(-2 / (ohms*farads) ) );
    time_3 = volts * ( 1 - Math.exp(-3 / (ohms*farads) ) );
    time_4 = volts * ( 1 - Math.exp(-4 / (ohms*farads) ) );
  }
}
