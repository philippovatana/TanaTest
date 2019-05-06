import java.util.Scanner;

public class HomeWork0904 {

          public static void main (String[] args) {

            Scanner in = new Scanner(System.in);

            System.out.print("Введите число: ");


            double summ = seriesSum(number);

            System.out.println(summ);

            in.close();

        }

        public static double seriesSum(int number) {

            double summ = 0;

            double element = 1;


            for (int i = 0; i < number; ++i) {

                summ += element;

                element /= -2;

            }

            return summ;
        }
    }




