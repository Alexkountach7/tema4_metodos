package org.example;

import static org.example.programame.teclado;

public class programame3 {

    // Asume fichero llamado solution.java
    public class solution {

        static java.util.Scanner in;

        public static boolean casoDePrueba() {
            if (!in.hasNext())
                return false;
            else {
                int toros = teclado.nextInt();
                int velocidad_corredor = 0;
                for (int i =0; i<toros; i++){
                    int velocidad_toro = teclado.nextInt();
                    if (velocidad_toro>velocidad_corredor){
                        Syste
                    }
                }

                return true;
            }
        } // casoDePrueba

        public static void main(String[] args) {
            in = new java.util.Scanner(System.in);
            while (casoDePrueba()) {
            }
        } // main

    } // class solution
