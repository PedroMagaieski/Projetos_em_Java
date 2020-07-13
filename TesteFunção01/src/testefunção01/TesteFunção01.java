/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testefunção01;

/**
 *
 * @author MP
 */
public class TesteFunção01 {

    /**
     * @param args the command line arguments
     */
    static int soma(int a,int b){ //static void
        int s = a + b;
        //System.out.println("a soma é " + s);
        return s;
    }
    public static void main(String[] args) {
        // TODO code application logic here
          //soma(5,2);
          System.out.println("começou a rodar o programa");
          int sm = soma(5,2);
          System.out.println("a soma é " + sm);
          
          
    }
  }
    

