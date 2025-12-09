package org.example;

import java.util.Scanner;

public class programame {

    static Scanner teclado;

    public static void main(String[] args) {

        teclado = new Scanner(System.in);

        int numCasos = teclado.nextInt();
        teclado.nextLine(); // Consumimos el salto de línea

        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    }

    public static void casoDePrueba() {
        String persona[] = teclado.nextLine().split(" ");
        System.out.println("hola, " + persona[1] + ".");
    }
    public static boolean Casodeprueba() {
        int x = teclado.nextInt();
        int y = teclado.nextInt();
        teclado.nextLine();
        if (x<0 || y<0){
            System.out.println("valor incorrecto");
            return false;
        }else {
            int resultado = (x+y)*2;
            System.out.println(resultado);
            return true;
        }

    }
}
