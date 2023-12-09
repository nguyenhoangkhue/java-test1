package test;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = (int) (Math.random() * 1000);
        System.out.println(n);

        System.out.println(isPrimeNumber(n));
    }
    public static boolean isPrimeNumber(int n) {

        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}