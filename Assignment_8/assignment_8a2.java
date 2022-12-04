import java.lang.*;
class MinMaxPriority extends Thread
{
public void run()
{
//print Statement
System.out.println("Minimum and Maximum Priority Thread Running");
}
public static void main(String[]args)
{
MinMaxPriority p1 = new MinMaxPriority();
MinMaxPriority p2 = new MinMaxPriority();
p1.start();
p2.start();
//therefore the P1 is running maximum priority
System.out.println("max thread priority : " + p1.MAX_PRIORITY);
// as well as P2 is running maximum priority
System.out.println("min thread priority : " + p2.MIN_PRIORITY);
}
}
