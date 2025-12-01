package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("introduce tu nombre");
        String nombre = sc.nextLine();

        int num = prueba.prueba(10, "patri");
        System.out.println(num);

        prueba.procedimiento();


        String[] perros = {"Boby", "Luna", "Max"};

        System.out.println("perros: ");
        for (int i = 0; i < perros.length; i++) {
            System.out.println(perros[i]);
        }
        varios("palabra", 1,2,3,4);

    }
    public static void varios (int... num) {
        for (int i =0; i< num.length; i++){
            System.out.println();
        }

    }
}
