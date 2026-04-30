/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio8;

/**
 *
 * @author paulo
 */
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] vendas = new double[12][4];
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", 
                          "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        double totalAno = 0;

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Venda " + meses[i] + " Semana " + (j+1) + ": ");
                vendas[i][j] = sc.nextDouble();
                totalAno += vendas[i][j];
            }
        }

        for (int i = 0; i < 12; i++) {
            double totalMes = 0;
            for (int j = 0; j < 4; j++) totalMes += vendas[i][j];
            System.out.println("Total " + meses[i] + ": R$" + totalMes);
        }

        for (int j = 0; j < 4; j++) {
            double totalSemana = 0;
            for (int i = 0; i < 12; i++) totalSemana += vendas[i][j];
            System.out.println("Total Semana " + (j+1) + " no ano: R$" + totalSemana);
        }

        System.out.println("Total Geral Ano: R$" + totalAno);
    }
}