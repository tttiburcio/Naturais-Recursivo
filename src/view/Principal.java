package view;

import controller.RecursividadeNaturais;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        RecursividadeNaturais recursividadeNaturais = new RecursividadeNaturais();

        System.out.println("Entre com o valor a ser somado: ");
        int n = scan.nextInt();

        int resultado = recursividadeNaturais.natural(n);
        System.out.println(resultado);
    }

}
