import java.util.Scanner;
public class TF{
    public static void main(String[] args){
    Scanner input= new Scanner(System.in);
        Float a;
        System.out.println("Введите первое число");
        a= input.nextFloat();
        Float b;
        System.out.println("Введите второе число");
        b= input.nextFloat();
        if (Math.abs(35 - a) == Math.abs(35 - b))
            System.out.println("Числа а и в равноудалены от 35");

        else if (Math.abs(35 - a) > Math.abs(35 - b))
            System.out.println("Ближайшее число к 35 = " + b);
        else
            System.out.println("Ближайшее число к 35 = " + a);

}}