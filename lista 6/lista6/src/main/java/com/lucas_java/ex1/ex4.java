
package com.lucas_java.ex1;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class ex4 {
    public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n[] = new int[20];
		for (int i = 0; i < 20; i++) {
			System.out.println("Escolha o numero " + (i + 1) + " da sequencia");
			n[i] = ler.nextInt();
		}
		for (int i = 0; i < 20; i++) {
			for (int j = i + 1; j < 20; j++) {
				if (n[i] == n[j]) {
					System.out.println("");
				}
			}
		}
		ler.close();
	}
}
