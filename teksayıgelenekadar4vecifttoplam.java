package patikaw3;

import java.util.Scanner;

public class teksayıgelenekadar4vecifttoplam {
    public static void main(String[] args) {
        int sayi,toplam=0;    
        Scanner input=new Scanner(System.in);
        do{
            System.out.println("sayi girin.");
            sayi=input.nextInt();
            if(sayi%4==0){
                toplam+=sayi;
            }else if (sayi % 2 == 0) {
                toplam += sayi;
            }else{
                break;
            }
        }while(sayi/2!=1);
        System.out.println("Tek sayı yazana kadar olan sayıların 4 bölünen ve çift sayıları toplamı "+toplam);
    
    
    }   
}