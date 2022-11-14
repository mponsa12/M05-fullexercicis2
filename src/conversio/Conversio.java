/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversio;

import java.util.Scanner;

/**
 *
 * @author DAM
 */
public class Conversio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int menu;
        
        do{
            System.out.println("MENU");
            System.out.println("1. Conversió d'EURO a LLIURA");
            System.out.println("2. Conversió de LLIURA a EURO");
            System.out.println("3. Sortir");
            
            System.out.println("\n Tria una opció: ");
            
            menu = sc.nextInt();
            
            
            switch (menu){
                case 1:
                        System.out.println("\nCONVERSIÓ D'EUROS A LLIURES");
                        System.out.println("Introdueix en €:");
                        int valor_euros = sc.nextInt();

                        double tipus_de_canvi = 1.15d;
                        System.out.println(valor_euros + " euros (€) actualment equivalen a " + (valor_euros / tipus_de_canvi) + " lliures esterlines (£).");

                        System.out.println("\nPrem INTRO per tornar al menú");
                        sc.nextLine();
                        sc.nextLine();
                        
                    break;
                    
                case 2:
                    System.out.println("");
                    
             
                    break;
                    
                case 3:
                    System.out.println("\nHas escollit sortir. Adéu!");
                    break;
                    
                default:
                    System.out.println("\nOpció INCORRECTA, ha de ser de l'1 al 3");
                }
                
        } while (menu != 3);
        
    }
}
