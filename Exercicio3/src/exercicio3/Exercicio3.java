/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio3;

import java.util.Scanner;

/**
 *
 * @author paulo
 */
public class Exercicio3 {

    /**
     * @param args the command line arguments
     */
    
       


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[9];

        for (int i = 0; i < 9; i++) {
            System.out.print("Número na posição " + i + ": ");
            vet[i] = sc.nextInt();
        }

        System.out.println("\nNúmeros Primos encontrados:");
        for (int i = 0; i < 9; i++) {
            if (isPrimo(vet[i])) {
                System.out.println("Valor: " + vet[i] + " | Posição: " + i);
            }
        }
    }

    public static boolean isPrimo(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
        // TODO code application logic here
    
    

