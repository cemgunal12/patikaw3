package patikaw3;

import java.util.Scanner;

public class TerstenUcgen {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sayi;
        System.out.println("Üçgenin basamak sayısını giriniz. ");
        sayi=input.nextInt();

        for(int i=sayi;0<=i;i--){
        for(int j=(sayi-i);j>=0;j--){
            System.out.print(" ");
        }
        for(int k=(2*i+1);k>=1;k--){
            System.out.print("*");
        }
        System.out.println(" ");
        }
    }
}
