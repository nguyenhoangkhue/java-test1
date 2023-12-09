package test;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Nhập vào số dòng của mảng: ");
        int soDong = scanner.nextInt();
        System.out.println("Nhập vào số cột của mảng: ");
        int soCot = scanner.nextInt();

        int [][]A=new int[soDong][soCot];

        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print("Nhập phần tử [" + i + ", " + j + "] của mảng 1: ");
                A[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Mảng vừa nhập: ");
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println("");
        }

        System.out.println("Đường chéo chính của mảng vừa nhập: ");
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                if (soDong!=soCot){
                    System.out.println("Không tồn tại Đường chéo chính");
                    return;
                }else {
                    if (i==j||i+j==soDong-1){
                        System.out.print(A[i][j]+"\t");
                    }else {
                        System.out.print(""+"\t");
                    }
                }
            }
            System.out.println("");
        }

        int [][]B=new int[soDong][soCot];

        for (int i1 = 0; i1 < soDong; i1++) {
            for (int j1 = 0; j1 < soCot; j1++) {
                System.out.print("Nhập phần tử [" + i1 + ", " + j1 + "] của mảng 2: ");
                B[i1][j1] = scanner.nextInt();
            }
        }

        System.out.println("Mảng vừa nhập: ");
        for (int i1 = 0; i1 < soDong; i1++) {
            for (int j1 = 0; j1 < soCot; j1++) {
                System.out.print(B[i1][j1] + "\t");
            }
            System.out.println("");
        }


        int [][]C=new int[soDong][soCot];
        System.out.println("Tổng của 2 mảng là: ");
        for (int i2 = 0; i2 < soDong; i2++) {
            for (int j2 = 0; j2 < soCot; j2++) {
                for (int i = 0; i < soDong; i++) {
                    for (int j = 0; j < soCot; j++) {
                        for (int i1 = 0; i1 < soDong; i1++) {
                            for (int j1 = 0; j2 < soCot; j1++) {
                                if (i == i1 | j == j1) {
                                    C[i2][j2] = A[i][j] + B[i1][j1];
                                    System.out.print(C[i2][j2] + "\t");
                                } else {
                                    System.out.print(""+"\t");
                                }
                            }
                        }
                    }
                }

            }
            System.out.println("");
        }
    }
}
