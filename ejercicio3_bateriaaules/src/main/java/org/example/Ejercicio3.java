package org.example;

import java.util.Scanner;

public class Ejercicio3 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("introduce una cadena ");
        String cadena = sc.nextLine();
        cadena = mayusculas(cadena);
        System.out.println(cadena);
        System.out.println(contarvocales(cadena));

    }
    public static String mayusculas(String cadena){
        return cadena.toUpperCase();
    }

    public static int contarvocales (String cadena) {
        int numero_vocales=0;
        for (int i=0; i<cadena.length(); i++){
            switch (cadena.charAt(i)){
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'u':
                    numero_vocales++;
                    break;
            }
        }
        return numero_vocales;
    }
}
