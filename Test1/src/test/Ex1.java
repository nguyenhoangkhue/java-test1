package test;

public class Ex1 {
    public static void main(String[] args) {
        System.out.println(pic1());

        System.out.println(pic2());

        System.out.println(pic3());
    }

    public static String pic1(){
        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                System.out.print("*"+"\t");
            }
            System.out.println("");
        }
        return " ";
    }

    public static String pic2(){
        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                if (j==0||i==3||i==j||i==2&&j==1){
                    System.out.print("*"+"\t");
                }else {
                    System.out.print(""+"\t");
                }
            }
            System.out.println("");
        }
        return " ";
    }

    public static String pic3(){
        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                if (i==3||j==3||i+j==3||i==2&&j==2){
                    System.out.print("*"+"\t");
                }else {
                    System.out.print(""+"\t");
                }
            }
            System.out.println("");
        }
        return " ";
    }
}