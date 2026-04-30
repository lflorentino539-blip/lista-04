/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio2;

import java.util.Scanner;

/**
 *
 * @author paulo
 */
public class Exercicio2 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] original = new int[8];
        int[] pos = new int[8];
        int[] neg = new int[8];
        int contP = 0, contN = 0;

        System.out.println("Digite 8 números:");
        for (int i = 0; i < 8; i++) {
            original[i] = sc.nextInt();
            if (original[i] >= 0) pos[contP++] = original[i];
            else neg[contN++] = original[i];
        }

        System.out.print("Positivos: ");
        for (int i = 0; i < contP; i++) System.out.print(pos[i] + " ");
        
        System.out.print("\nNegativos: ");
        for (int i = 0; i < contN; i++) System.out.print(neg[i] + " ");{
       
    
    
    }
    }
}












