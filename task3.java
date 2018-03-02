import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double a, b, r;
        System.out.println("Введите сторону a: ");
        a = scn.nextInt();
        System.out.println("Введите сторону b: ");
        b = scn.nextInt();
        System.out.println("Введите радиус окружности r: ");
        r = scn.nextInt();
        double x = (double) (Math.sqrt(a * a + b * b)) / 2;
        if (x <= r)
            System.out.println("Окружность закроет отверстие");
        else
            System.out.println("Окружность не закроет отверстие");
    }
}