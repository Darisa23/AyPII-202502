package Ejercicios_Laboratorios;


/*
 * Ejercicio laboratorio del 5 de Agosto:
 * Este programa solicita al usuario que ingrese el tamaño de un arreglo, 
 * los valores que lo componen, y la posición que desea eliminar.
 * Luego, realiza la eliminación desplazando los elementos hacia la izquierda.
 */

import java.util.Scanner;

public class Lab01{

    public static void main(String[] args) {
        // Creamos un objeto Scanner para poder leer datos que el usuario escriba por teclado
        Scanner read = new Scanner(System.in);
        
        // Primero pedimos al usuario cuántos elementos tendrá el arreglo
        System.out.print("Ingrese la cantidad de elementos del arreglo: ");
        int n = read.nextInt();
        
        // Ahora pedimos la posición que se quiere eliminar
        // Importante: las posiciones empiezan en 0 hasta (n-1)
        System.out.print("Ingrese la posición a eliminar (de 0 a " + (n-1) + "): ");
        int x = read.nextInt();
        
        // Creamos el arreglo con el tamaño indicado por el usuario
        int a[] = new int[n];
        
        // Llenamos el arreglo pidiendo los valores uno a uno
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el valor para la posición #" + i + ": ");
            a[i] = read.nextInt();
        }
        
        // Verificamos si la posición ingresada está dentro del rango válido
        if (x >= 0 && x < n) { // Ajustado para permitir posición 0 y evitar errores
            
            // Si la posición es válida, desplazamos todos los elementos posteriores una posición a la izquierda
            for (int i = x; i < n - 1; i++) {
                a[i] = a[i + 1];
            }
            
            // Disminuimos el tamaño lógico del arreglo en 1
            n = n - 1;
            
            // Mostramos el arreglo resultante después de eliminar el elemento
            System.out.println("Proceso completado con éxito. Los valores del arreglo ahora son:");
            for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "--->");
            }
            System.out.println(" ");
        } else {
            // Si la posición no está en el rango, mostramos un mensaje de error
            System.out.println("La posición " + x + " no existe en el arreglo.");
        }
    }
}
