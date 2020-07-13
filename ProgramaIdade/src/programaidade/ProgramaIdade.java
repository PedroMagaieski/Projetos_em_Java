/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaidade;

import java.util.Scanner;
/**
 *
 * @author MP
 */
public class ProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner t = new Scanner(System.in);
        System.out.println("em que ano vc nasceu?");
        int nasc = t.nextInt();
        int i = 2015 - nasc;
        System.out.println("sua idade é " + i);
        if (i>=18){
            System.out.println("maior de idade");
        }else {
            System.out.println("menor de idade");
        }
    }
    
}
