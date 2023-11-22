import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        System.out.println("Задание № 12");
        Scanner sc = new Scanner(System.in);
        double dist = 0;
        double x;
        double y;
        int days = 0;
        System.out.println("Enter x: ");
        x = sc.nextDouble();
        System.out.println("Enter y: ");
        y = sc.nextDouble();
        while (dist < y) {
            dist += x;
            x *= 1.1;
            days++;
        }
        System.out.println(days + " days");

    }
}
