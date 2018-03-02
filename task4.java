import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        System.out.println("Введите любое целое число: ");
        Scanner scn = new Scanner(System.in);
        int scan = scn.nextInt();
        int ost = scan % 10;
        int conditOne = (ost - 1);
        int conditTwo = (ost - 2);
        int conditThree = (ost - 3);
        int conditFour = (ost - 4);
        if (4 < scan && scan < 21)
            System.out.println(scan + " рублей");
        else if (conditOne == 0)
            System.out.println(scan + " рубль");
        else if (conditTwo == 0 || conditThree == 0 || conditFour == 0)
            System.out.println(scan + " рубля");
        else if (ost == 0)
            System.out.println("Вы ввели ноль");
        else
            System.out.println(scan + " рублей");
    }
}