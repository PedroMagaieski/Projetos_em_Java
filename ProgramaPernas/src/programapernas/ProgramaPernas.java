/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programapernas;

import java.util.Scanner;

/**
 *
 * @author MP
 */
public class ProgramaPernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec = new Scanner(System.in);
        System.out.println("quantas pernas");
        int perna = tec.nextInt();
        String tipo;
        System.out.println("isso é um ");
        switch (perna) {
            case 1:
                tipo = "saci";
                break;
            case 2 :
                tipo = "bípede";
                break;
            case 4 :
                tipo = "quadrupede";
                break;
            case 6 :
                tipo = "inseto ou aracnideo";
                break;
            default :
                tipo = "ET";
                break;                
        }
        System.out.println(tipo);
    }
    
}
