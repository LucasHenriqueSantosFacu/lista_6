/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lucas_java.ex1;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class ex2 {
    public static void main(String[] args){
    Scanner ler = new Scanner(System.in);
		int n[] = new int[5];
		int maior = 0, menor = 0, media = 0, soma = 0;
		System.out.println("Escolha 5 numeros:");
		for (int i = 0; i < 5; i++) {
			n[i] = ler.nextInt();
			if (i == 0) {
				maior = n[i];
				menor = n[i];
			}
			if (maior < n[i]) {
				maior = n[i];
			}
			if (menor > n[i]) {
				menor = n[i];
			}
			soma = soma + n[i];
		}
		media = soma / 5;
		for (int i = 0; i < 5; i++) {
			System.out.print(n[i] + " ");
		}
		System.out.println("\n" + "O maior numero foi:" + maior + "\n" + "O menor numero foi:" + menor + "\n"
				+ "E a media foi " + media);
		ler.close();
	}
}
