import java.util.Scanner;
public class assignment_2 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int a ,b;
System.out.println("Enter two numbers:");
a = sc.nextInt();
b = sc.nextInt();
a = a+b;
b = a-b;
a = a-b;
System.out.println("After swapping:"+ a + " " + b);
}
}