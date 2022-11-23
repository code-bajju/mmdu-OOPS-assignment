import java.util.Scanner;

public class assignment_4 {
    public static void main(String args[]) {
        char operator;
        int number1, number2, number3;
        float float1, float2, float3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice:");
        operator = sc.next().charAt(0);
        switch (operator) {
            case '1':
                System.out.println("Enter the two numbers for addition(by using spacebar)");
                number1 = sc.nextInt();
                number2 = sc.nextInt();
                System.out.printf("%d + %d = %d", number1, number2,
                        (number1 + number2));
                break;
            case '2':
                System.out.println("Enter the three numbers for addition(by using spacebar)");
                number1 = sc.nextInt();
                number2 = sc.nextInt();
                number3 = sc.nextInt();
                System.out.printf("%d + %d + %d = %d", number1,
                        number2, number3, (number1 + number2 + number3));
                break;
            case '3':
                System.out.println("Enter the two float number:");
                float1 = sc.nextFloat();
                float2 = sc.nextFloat();
                System.out.printf("%f + %f = %f", float1, float2,
                        (float1 + float2));
                break;
            case '4':
                System.out.println("Enter the three float number :");
                float1 = sc.nextFloat();
                float2 = sc.nextFloat();
                float3 = sc.nextFloat();
                System.out.printf("%f + %f + %f = %f", float1, float2,
                        float3, (float1 + float2 + float3));
                break;
            default:
                System.out.printf("%c is an WRONG choice", operator);
        }
        sc.close();
    }
}
