/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 classes Math: Math.PI(3,14...), Math.pow(potencia:(5,2)=25), Math.sqrt(raiz quadrada:(25)=5),
Math.cbrt(raiz cubica:(27)=3), Math.abs(valor absoluto:(-10)=10)
Math.floor(arredondamento para baixo:(3.9)=3)
Math.ceil(arredondamento para cima:(4.2)=5)
Math.round(arredondamento arritimético:(5.6)=6)
Math.random(gera um numero entre 0.0 e 1.0)
 */
package operadoresaritiméticos;

/**
 *
 * @author MP
 */
public class OperadoresAritiméticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /* int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2)/2;
        System.out.println("a média é igual a "+m);*/
        
        /*int numero = 5;
        int valor = 4 + --numero;
        System.out.println(numero);
        System.out.println(valor);*/
       /* int x = 8;
        x /= 2; //x recebe x + 2
        System.out.println(x);*/
       /*float v = 8.5f;
       int ar = (int) Math.round(v);
        System.out.println(ar);*/
       double ale = Math.random();
       int n = (int)(1 + ale * (100-1));
        System.out.println(n);
    }
    
}
