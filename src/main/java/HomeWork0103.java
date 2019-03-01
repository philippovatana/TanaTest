public class HomeWork0103 {
    public static void main(String[] args) {
        double a = 10.5, b = 15.5, c = 30;
        if (Math.abs(c - a) < Math.abs(c - b)) {
            System.out.println("Число " + a + " ближе к числу " + c);
        } else {
            System.out.println("Число " + b + " ближе к числу " + c);

        }

    int n=20;
    if(n%2==0){
        System.out.println("Число " + n + " является четным");
    }else {
        System.out.println("Число " + n + " является нечетным");
    }
        double k = (int)( Math.random() * (155-5) ) + 5;

        if( k > 25 & k < 100){
            System.out.println("Число " + k + " попадает в отрезок от 25 до 100");
        } else {
            System.out.println("Число " + k + " не попадает в отрезок от 25 до 100");
        }
}
}