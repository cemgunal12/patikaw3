package patikaw3;

import java.util.Scanner;

public class ÜslüSayı {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n,k;
        int total=1;

        System.out.println("Üssü alınıcak sayıyı giriniz.");
        n=input.nextInt();

        System.out.println("Üs giriniz.");
        k=input.nextInt();

        for(int i=1;i<=k;i++){
            total*=n;
        }
        System.out.println(total);
    }

}
