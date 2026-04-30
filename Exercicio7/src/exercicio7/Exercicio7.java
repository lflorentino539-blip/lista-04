/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio7;

/**
 *
 * @author paulo
 */
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        int somaPares = 0, qtdImpares = 0;

        for (int i = 0; i < 6; i++) vet[i] = sc.nextInt();

        System.out.println("RELATÓRIO");
        System.out.println("Os números pares são:");
        for (int i = 0; i < 6; i++) {
            if (vet[i] % 2 == 0) {
                System.out.println("numero " + vet[i] + " na posição " + (i + 1));
                somaPares += vet[i];
            }
        }
        System.out.println("Soma dos pares = " + somaPares);

        System.out.println("Os números ímpares são:");
        for (int i = 0; i < 6; i++) {
            if (vet[i] % 2 != 0) {
                System.out.println("numero " + vet[i] + " na posição " + (i + 1));
                qtdImpares++;
            }
        }
        System.out.println("Quantidade de ímpares = " + qtdImpares);
    }
}