package org.example;

public class ejercicio_sumar_recur {
    static void main() {
        sumar(10);
        System.out.println(sumar(10));
    }
    public static int sumar (int num){
        if (num == 0) {
            return 0;
        }else {
            return num + sumar(num-1);
        }
    }
}
