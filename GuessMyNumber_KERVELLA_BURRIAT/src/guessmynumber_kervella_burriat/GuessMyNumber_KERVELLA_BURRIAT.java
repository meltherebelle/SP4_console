/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guessmynumber_kervella_burriat;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mario
 */
public class GuessMyNumber_KERVELLA_BURRIAT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random generateurAleat = new Random();
        int n = generateurAleat.nextInt(100);
        Scanner sc = new Scanner(System.in);
        int nb;
        int Nbessai = 0;
        int niveau;
        System.out.println("\n Saississez le numéro du niveau que vous souhaitez :\n 1)Difficile \n 2)Normal \n 3)Facile \n 4) Mode cauchemar!!!");
        niveau = sc.nextInt();

        if (niveau ==1 ||  niveau == 2 || niveau == 3 || niveau==4) {

            if (niveau ==1) {
                do {
                    System.out.println("\n Saississez un nombre entre 0 et 100 :");
                    nb = sc.nextInt();
                    if (nb < n) {
                        System.out.println(" Trop petit ");
                        if (Nbessai <= 5) {
                            Nbessai += 1;
                        } else {
                            System.out.println(" Plus de tentatives possibles");
                            break;
                        }
                    }
                    if (nb > n) {
                        System.out.println(" Trop grand! ");
                        if (Nbessai <= 5) {
                            Nbessai += 1;
                        } else {
                            System.out.println(" Plus de tentatives possibles");
                            break;
                        }
                    if (nb == n) {
                        System.out.println(" gagné ");
                        System.out.println(" Le nombre de vos tentatives: " + Nbessai);
                        break;
                    }
                    }
                } while (nb != n);
            }    

            if (niveau ==2) {
                do {
                    
                    System.out.println("\n Saississez un nombre entre 0 et 100 :");
                    nb = sc.nextInt();
                    if (nb < n) {
                        System.out.println(" Trop petit! ");
                        Nbessai += 1;
                    }
                    if (nb > n) {
                        System.out.println(" Trop grand! ");
                        Nbessai += 1;
                    }
                    if (nb == n) {
                        System.out.println(" gagné ");
                        System.out.println(" Le nombre de vos tentatives: " + Nbessai);
                        break;
                    }
                } while (nb != n);
            }
            if (niveau ==3) {
                do {

                    System.out.println("\n Saississez un nombre entre 0 et 100 :");
                    nb = sc.nextInt();
                    int diff1 = nb - n;
                    int diff2 = n - nb;
                    if (nb < n && diff2 > 20) {
                        System.out.println(" Vraiment trop petit ");
                        Nbessai += 1;
                    }
                    if (nb < n && diff2 < 20) {
                        System.out.println(" Trop petit ");
                        Nbessai += 1;
                    }
                    if (nb > n && diff1 > 20) {
                        System.out.println(" Vraiment Trop grand! ");
                        Nbessai += 1;
                    }
                    if (nb > n && diff1 < 20) {
                        System.out.println(" Trop grand! ");
                        Nbessai += 1;
                    }
                    if (nb == n) {
                        System.out.println(" gagné ");
                        System.out.println(" Le nombre de vos tentatives: " + Nbessai);
                        break;
                    }
                } while (nb != n);
            }
            if (niveau==4){
                
              do {
                    int a = generateurAleat.nextInt(10);
                    System.out.println("\n Saississez un nombre entre 0 et 100 :");
                    nb = sc.nextInt();
                    if (nb < n) {
                        if (a<=7){ 
                            System.out.println(" Trop petit! ");
                            Nbessai += 1;   
                        }else{
                            System.out.println(" Trop grand! ");
                            Nbessai += 1; 
                        }      
                    }
                    if (nb > n) {
                        if (a<=7){ 
                            System.out.println(" Trop grand! ");
                            Nbessai += 1;   
                        }else{
                            System.out.println(" Trop petit! ");
                            Nbessai += 1;
                        }       
                    }
                    if (nb == n) {
                        System.out.println(" gagné ");
                        System.out.println(" Le nombre de vos tentatives: " + Nbessai);
                        break;
                    }
                } while (nb != n);  
            }
            
        }
       
    }
}