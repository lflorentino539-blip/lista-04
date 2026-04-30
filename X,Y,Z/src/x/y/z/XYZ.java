/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package x.y.z;

import java.util.Scanner;

/**
 *
 * @author paulo
 */
public class XYZ {

    
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[10];
        int[] y = new int[10];
        int[] z = new int[20];

        System.out.println("Digite 10 números para o vetor X:");
        for (int i = 0; i < 10; i++) x[i] = sc.nextInt();

        System.out.println("Digite 10 números para o vetor Y:");
        for (int i = 0; i < 10; i++) y[i] = sc.nextInt();

        for (int i = 0; i < 10; i++) {
            z[i * 2] = x[i];
            z[i * 2 + 1] = y[i];
        }

        System.out.print("Vetor Z (intercalado): ");
        for (int num : z) System.out.print(num + " ");
    }
}
