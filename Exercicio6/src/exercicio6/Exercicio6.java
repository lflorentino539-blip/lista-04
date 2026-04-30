/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio6;

/**
 *
 * @author paulo
 */

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] precos = new double[10];
        int[] qtds = new int[10];
        double totalGeral = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Preço objeto " + (i+1) + ": ");
            precos[i] = sc.nextDouble();
            System.out.print("Qtd vendida: ");
            qtds[i] = sc.nextInt();
        }

        int maisVendidoIdx = 0;
        System.out.println("\n--- RELATÓRIO ---");
        for (int i = 0; i < 10; i++) {
            double totalItem = precos[i] * qtds[i];
            totalGeral += totalItem;
            System.out.printf("Qtd: %d | Unitário: R$%.2f | Total: R$%.2f\n", qtds[i], precos[i], totalItem);
            if (qtds[i] > qtds[maisVendidoIdx]) maisVendidoIdx = i;
        }

        System.out.printf("Venda Geral: R$%.2f\nComissão: R$%.2f\n", totalGeral, totalGeral * 0.05);
        System.out.println("Objeto mais vendido custa R$" + precos[maisVendidoIdx] + " na posição " + maisVendidoIdx);
    }
}