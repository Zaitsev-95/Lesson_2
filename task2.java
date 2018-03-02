import java.util.Random;

public class task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int inp = random.nextInt(1000);
        System.out.println("Полученное число: " + inp);
        int getRemainder = inp % 10;
        if (getRemainder == 7)
            System.out.println("Последнее число является семёркой");
        else
            System.out.println("Последнее число не является семёркой");
    }
}

