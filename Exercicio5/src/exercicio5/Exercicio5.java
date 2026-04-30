/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio5;

/**
 *
 * @author paulo
 */
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] temps = new double[12];
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", 
                          "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        
        int maiorM = 0, menorM = 0;

        for (int i = 0; i < 12; i++) {
            System.out.print("Temp de " + meses[i] + ": ");
            temps[i] = sc.nextDouble();
            if (temps[i] > temps[maiorM]) maiorM = i;
            if (temps[i] < temps[menorM]) menorM = i;
        }

        System.out.println("Maior: " + temps[maiorM] + " em " + meses[maiorM]);
        System.out.println("Menor: " + temps[menorM] + " em " + meses[menorM]);
    }
}