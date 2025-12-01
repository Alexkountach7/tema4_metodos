package org.example;

import java.util.Scanner;

public class Cubo {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("dime un numero ");
        int numero = sc.nextInt();
        // validar numero
        int resultado = cubo(numero);
        System.out.println("el resultado del cubo " +resultado);
    }

    public static int cubo (int numero) {

        return numero*numero*numero;
    }
}
