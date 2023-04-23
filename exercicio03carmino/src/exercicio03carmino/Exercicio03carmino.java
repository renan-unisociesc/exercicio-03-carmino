/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio03carmino;

import java.util.Scanner;
/**
 *
 * @author Renan
 */
public class Exercicio03carmino {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int divisor = 6;
        int quintoMaiorNumero = 1001;
        
        while (divisor >= 6) {
            System.out.println("Digite um numero inteiro positivo maior que 5: ");//qualquer numero inteiro que seja 5 ou menos nao entrará, pois vai dar resto 4 ou menos, e procuramos resto 5.
            divisor = entrada.nextInt(); 
            if (divisor <6){
                System.out.println("voce digitou um numero incorreto");
                return;
            }
            for (int i=0; i<5; i++) {
                while ((quintoMaiorNumero % divisor) !=5 ){ //o resultado sempre dará um resultado inteiro entre 0 e 4.
                    quintoMaiorNumero = quintoMaiorNumero + 1;
                } 
                quintoMaiorNumero = quintoMaiorNumero + 1;
            }                 
            System.out.println("O quinto maior numero que 1000, que tem resto 5 na divisao por " + divisor + " e: " + (quintoMaiorNumero-1));                   
            quintoMaiorNumero = 1001;
        }   
    }
}
