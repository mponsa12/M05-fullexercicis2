/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversio;

import java.util.Scanner;

/**
 *
 * @author nil
 */
public class Conversio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introdueix en €");
        int valor_euros = sc.nextInt();
                
        double tipus_de_canvi = 1.15d;
        System.out.println(valor_euros + " eur0s (€) acatualmentt ewuivalen a" + (valor_euros / tipus_de_canvi) + " lliures esterlines (£)");
    }
    
}
