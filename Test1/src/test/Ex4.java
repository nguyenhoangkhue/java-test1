package test;

public class Ex4 {
    public static void main(String[] args) {
        int dem = 0;
        int i = 2;
        System.out.println("10 số nguyên tố đầu tiên là: ");
        while (dem < 10) {
            if (isPrimeNumber(i)) {
                System.out.print(i + " ");
                dem++;
            }
            i++;
        }

        System.out.printf("\nTất cả các số nguyên tố nhỏ 10 là: \n");
        if (i >= 2) {
            System.out.print(2);
        }
        for (i = 3; i < 10; i+=2) {
            if (isPrimeNumber(i)) {
                System.out.print(" " + i);
            }
        }
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