package test;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập chuỗi kí tự bất kì");
        String str = sc.nextLine();

        System.out.println("Chuỗi có " + num(str) + " kí tự");

        System.out.println(count(str));
    }
    public static int num (String str){
        int sotu = str.length();
        return sotu;
    }

    public static int count(String str){
        char kyTu = 'o';
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == kyTu) {
                count++;
            }
        }
        System.out.println("Chuỗi có "+count+" chữ o");
        return count;
    }
}