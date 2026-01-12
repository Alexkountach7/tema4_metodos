package org.example;

public class ejercicio_5_recursivo {
    public static boolean es_binario(int numero) {

        if (numero > 9) {
            if (numero % 10 != 0 && numero % 10 != 1) {
                return false;

            } else {
                return es_binario(numero / 10);
            }

        }else{
            if (numero == 0 || numero == 1){
                return true;
            }else {
                return false;
            }
        }

    }

    static void main() {
        System.out.println(es_binario(01));
    }
}

