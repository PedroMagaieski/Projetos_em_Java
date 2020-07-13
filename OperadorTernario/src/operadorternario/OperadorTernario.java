/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*operadores: >(maior)<(menor)>=(maior ou igual)<(menor ou igual)==(igual a)!=(diferente de)*/ 
/*operadores lógicos && (.E.) || (.OU.) ^(.XOU.(OU exclusivo))!(.NAO.)*/

/**
 *
 * @author MP
 */
public class OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1, n2, r;
        n1 = 14;
        n2 = 13;
        r = (n1>n2)?n1+n2:n1-n2;
        System.out.println(r);
    }
    
}
