import java.util.Scanner;
public class assignment_1 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter the number of eggs:");
int eggs = input.nextInt();
int gross = eggs/144;
int A = eggs%144;
int dozen = A/12;
int left = A%12;
System.out.println("Your no. of egg is "+ gross + "gross,"+dozen+" dozen and " + left +".");
}
}