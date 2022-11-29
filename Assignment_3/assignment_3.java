import java.util.Scanner;

public class assignment_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Income: ");
        int income = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Category: ");
        String category = sc.nextLine();
        int tax = 0;
        sc.close();
        if (category.equals("GENERAL")) {
            if (income <= 180000)
                tax = 0;
            else if (income <= 500000)
                tax = (income - 180000) / 10;
            else if (income <= 800000)
                tax = (500000 - 180000) / 10 + (income - 500000) / 20;
            else
                tax = (500000 - 180000) / 10 + (800000 - 500000) / 20 +
                        (income - 800000) / 30;
            System.out.println("Your Tax: " + tax);
        } else if (category.equals("WOMEN")) {
            if (income <= 190000)
                tax = 0;
            else if (income <= 500000)
                tax = (income - 190000) / 10;
            else if (income <= 800000)
                tax = (500000 - 190000) / 10 + (income - 500000) / 20;
            else
                tax = (500000 - 190000) / 10 + (800000 - 500000) / 20 +
                        (income - 800000) / 30;
            System.out.println("Your Tax: " + tax);
        } else
            System.out.println("WRONG CHOICE AND EXIT");
    }
}