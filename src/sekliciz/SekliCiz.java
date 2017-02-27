/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sekliciz;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author melisaborekcioglu
 */
public class SekliCiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char cikis = 'h';
        while (cikis == 'h') {
            try {
                Scanner input = new Scanner(System.in);
                System.out.print("1 ile 20 arasında bir tam sayi giriniz: ");
                int deger = input.nextInt();
                
                if(deger <1 || deger>20){
                System.out.println("Yanlış değer girdiniz!");
                devamMi();
                }
                

                for (int i = 1; i <= deger; i++) {
                    int x = (i % 5);
                    if (x == 1) {
                        System.out.println("  *  ");
                    }
                    if (x == 2) {
                        System.out.println(" *** ");
                    }
                    if (x == 3) {
                        System.out.println("*****");
                    }
                    if (x == 4) {
                        System.out.println(" *** ");
                    }
                    if (x == 0) {
                        System.out.println("  *  ");
                    }
                   
                }
                
            } catch (InputMismatchException e) {
                System.out.println("Lütfen sadece sayı giriniz.");
            
            } 
devamMi();
        }
    
    }
    
    public static char devamMi() {
        Scanner s = new Scanner(System.in);
        char devam;
        while (true) {
            char a;
            System.out.println("Devam etmek ister misiniz ? (E/H) ");
            a = s.next().charAt(0);
            
            devam = Character.toUpperCase(a);
            if (devam == 'E') {
                System.out.println("ffghjk ");
                break;
         
            } else {
                 System.exit(0);
        
            }
        }
        return devam;
    }

}


