/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio4;

/**
 *
 * @author paulo
 */
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] gabarito = new char[8];
        int aprovados = 0;

        System.out.println("Digite o gabarito (8 letras):");
        for (int i = 0; i < 8; i++) gabarito[i] = sc.next().charAt(0);

        for (int aluno = 1; aluno <= 10; aluno++) {
            System.out.print("Número do aluno: ");
            int numAluno = sc.nextInt();
            int nota = 0;
            System.out.println("Respostas do aluno:");
            for (int i = 0; i < 8; i++) {
                if (sc.next().charAt(0) == gabarito[i]) nota++;
            }
            System.out.println("Aluno " + numAluno + " - Nota: " + nota);
            if (nota >= 6) aprovados++;
        }

        System.out.println("Porcentagem de aprovação: " + (aprovados * 10) + "%");
    }
}