import java.util.Scanner;

public class Base2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String day;
        System.out.println("Какой сегодня день недели");
        day = input.nextLine();
        String text;
        text = "Сегодня " + day;
        System.out.println(text);
    }
}
