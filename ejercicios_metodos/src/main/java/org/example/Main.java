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


    }
    public static void varios (int... num) {
        for (int i =0; i< num.length; i++){
            System.out.println();
        }

    }

    public class ejercicio_2_menu {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("cuantas opciones quieres");
            int n = sc.nextInt();
            mostrarmenu(n);
            System.out.println("elige una opcion");
            int opcion = sc.nextInt();

        }

        public static void mostrarmenu(int n){
            for (int i =1; i<n-1; i++){
                System.out.println(i + ". Opcion" +i);
            }
            System.out.println(n +"salir");
        }
    }

    }

