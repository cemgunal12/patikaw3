package patikaw3;

import java.util.Scanner;

public class sayilar3ve4ort {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int sayi,sonuc=0;
        System.out.println("Sayi giriniz. ");
        sayi=input.nextInt();

        for(int i=0;i<=sayi;i++){
            if((i%3==0)||(i%4==0)){
                sonuc+=i;
            }
        }
        sonuc/=sayi;
        System.out.println("3 ve 4'e tam bölünen sayıların ortalaması "+sonuc);
        }
    }
