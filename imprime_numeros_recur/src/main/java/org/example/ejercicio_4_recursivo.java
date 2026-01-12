package org.example;

import java.util.Scanner;

public class ejercicio_4_recursivo {
    public static String abinario (int numero) {
        if (numero ==0 || numero == 1) {
            return Integer.toString (numero);
        }else {
            return abinario(numero/2)+numero%2;
        }
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un numero ");
        int numero = sc.nextInt();
        System.out.println("el resultado es: ");
        System.out.println(abinario(5));
    }
}
