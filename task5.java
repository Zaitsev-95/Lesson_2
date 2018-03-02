import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        String str = "# #?#! #?#! #?###!";
        String newStr1 = str.replace("?", "HELLO");
        String newStr2 = newStr1.replace("#", "");
        System.out.println(newStr2);
    }
}
