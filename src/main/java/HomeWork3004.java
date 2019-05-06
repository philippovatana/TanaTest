public class HomeWork3004 {
public static void main(String[] args) {
    sequenceSum();
}

    public static void sequenceSum () {

        double summ = 0;

        double partible = 1.0;

        double denominator = 2.0;

        int count = 0;


        while (partible * 1000 > denominator) {

            summ += partible / denominator;

            partible += 1.0;

            denominator *= 2;

            ++count;


        }


        System.out.println("Sum:" + summ + "\nnumber:" + count);

    }

}

