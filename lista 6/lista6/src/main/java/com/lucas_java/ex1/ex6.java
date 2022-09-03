
package com.lucas_java.ex1;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class ex6 {
    public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n[] = new int[10];
		int x = 0;
		for(int i = 0; i < 10; i++) {
			System.out.println("Escolha um numero");
			n[i] = ler.nextInt();
		}
		System.out.println("Escolha um numero x");
		x = ler.nextInt();
		int xt = 0;
		for(int i = 0 ; i < 10; i++) {
			if(n[i] % x == 0) {
				System.out.println("O numero "+n[i]+" é multiplo de "+x);
				xt++;
			}
		}
		System.out.println("E foram um de "+xt);
		ler.close();
	}
}
