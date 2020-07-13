/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor02;

/**
 *
 * @author MP
 */
// (usar em código 2 e 3)import java.util.Arrays;
import java.util.Scanner;
public class Vetor02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //calcular se é bissexto
       /* Scanner ent = new Scanner(System.in);
        int ano;
        System.out.println("Digite um ano para saber se é bissexto");
        ano = ent.nextInt();
        // se o ano for maior que 400
        if(ano % 400 == 0){
            System.out.println(ano + " é bissexto");
        // se o ano for menor que 400
        } else if((ano % 4 == 0) && (ano % 100 != 0)){
            System.out.println(ano + " é bissexto");
        } else{
            System.out.println(ano + " não é bissexto");
        }*/
        
        //vetores
        String mes[] = {"jan","fev","mar","abr","mai","jun","jul","ago","set","out","nov","dez"};
        int tot[] ={31,28,31,30,31,30,31,30,31,30,31,30};
        int bis[] ={31,29,31,30,31,30,31,30,31,30,31,30};
        Scanner ent = new Scanner(System.in);
            int ano;
            System.out.println("Digite um ano");
            ano = ent.nextInt();
        for(int c=0; c<mes.length; c++){
            // se o ano for maior que 400
             if(ano % 400 == 0){
            System.out.println("o mes de "+ mes[c]+" tem " + bis[c] +" dias ao todo");
            // se o ano for menor que 400
            } else if((ano % 4 == 0) && (ano % 100 != 0)){
                System.out.println("o mes de "+ mes[c]+" tem " + bis[c] +" dias ao todo");
            } else{
                System.out.println("o mes de " + mes[c] + " tem " + tot[c] +" dias ao todo");
               }
               // System.out.println("o mes de " + mes[c] + " tem " + tot[c] +" dias ao todo");
        }
        /*código 1   int n[] = {3,2,8,7,5,4};
        System.out.println("total de casas de N é "+ n.length);
        for(int c=0; c<n.length-1; c++){
            System.out.print("na posição " + c + " temos o valor " + n[c] + " ");
        }
        código 2 
         double v[] = {3.5,2.75,9,-4.5};
        Arrays.sort(v);
        
        for (double valor : v){
            System.out.print(valor + " ");
        }
        código 3
          // TODO code application logic 
       /* parte 1 int vet[] = {3,7,6,1,9,4,2};
        for(int v:vet){
            System.out.print(v + " ");
        }
        System.out.println("");
        int p = Arrays.binarySearch(vet, 1);
        System.out.println("encontrei o valor na posição " + p);*/
       /*parte 2 int v[] = new int[20];
       Arrays.fill(v,0);
       for(int valor:v)
        System.out.print(valor + " ");
       }*/
         
      }
   }    

