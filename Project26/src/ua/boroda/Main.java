package ua.boroda;
// Таблица умножения
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int g;
        Scanner scn = new Scanner(System.in);
        System.out.println("ВВедите число");
        g = scn.nextInt();
        for (int j = 1; j <= 10; j++){
            int c = g * j;
            System.out.println(g + " * " + j + " = " + c);
        }
    }
}
