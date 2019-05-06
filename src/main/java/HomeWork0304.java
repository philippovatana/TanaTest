import java.util.Scanner;

public class HomeWork0304 {
    static class example {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Задание №1");
            int a;
            int b = 0;
            int c = 0;
            System.out.println("Введите число");
            a = in.nextInt();
            for (int i = 1; i <= Math.abs(a); i++) {

                if (i % 2 == 0) {
                    b++;
                } else {
                    c++;
                }
            }
            System.out.println("В числе " + a + " " + b + " нечетных и " + c + " четных");

            System.out.println("Задание №2");
            System.out.println("Введите число");
            int d = in.nextInt();
            int e = 0;
            int i = 0;
            while (i <= d) {
                if (i % 2 == 0) {
                    e = e + i;
                }
                i++;

            }
            System.out.println("В числе " + d + " сумма четных цифр " + e);
        }
    }
}


