package Píldoras_en_Java;

import java.util.Scanner;

public class Bono01 {
    public static void main(String[] args) {
        // Creamos el objeto Scanner para leer datos del usuario
        Scanner scanner = new Scanner(System.in);
        
        // PASO 1: Leer el vector A
        System.out.print("Ingrese el tamaño del vector A (NA): ");
        int NA = scanner.nextInt();
        
        // Declaramos el vector A con el tamaño especificado
        int[] A = new int[NA];
        
        // Leemos cada elemento del vector A
        System.out.println("Ingrese los elementos del vector A:");
        for (int i = 0; i < NA; i++) {
            System.out.print("A[" + i + "]: ");
            A[i] = scanner.nextInt();
        }
        
        // PASO 2: Leer el vector B
        System.out.print("Ingrese el tamaño del vector B (NB): ");
        int NB = scanner.nextInt();
        
        // Declaramos el vector B con el tamaño especificado
        int[] B = new int[NB];
        
        // Leemos cada elemento del vector B
        System.out.println("Ingrese los elementos del vector B:");
        for (int i = 0; i < NB; i++) {
            System.out.print("B[" + i + "]: ");
            B[i] = scanner.nextInt();
        }
        
        // PASO 3: Encontrar MAYA (el mayor elemento de A)
        // Inicializamos MAYA con el primer elemento de A
        int MAYA = A[0];
        
        // Recorremos todo el vector A para encontrar el mayor
        for (int i = 1; i < NA; i++) {
            // Si encontramos un elemento mayor, lo guardamos como MAYA
            if (A[i] > MAYA) {
                MAYA = A[i];
            }
        }
        
        System.out.println("\nMAYA (mayor de A): " + MAYA);
        
        // PASO 4: Encontrar MENB (el menor elemento de B)
        // Inicializamos MENB con el primer elemento de B
        int MENB = B[0];
        
        // Recorremos todo el vector B para encontrar el menor
        for (int i = 1; i < NB; i++) {
            // Si encontramos un elemento menor, lo guardamos como MENB
            if (B[i] < MENB) {
                MENB = B[i];
            }
        }
        
        System.out.println("MENB (menor de B): " + MENB);
        
        // PASO 5: Verificar si MAYA se encuentra en el vector B
        // Bandera para indicar si encontramos MAYA en B
        boolean mayaEnB = false;
        
        // Buscamos MAYA en todos los elementos de B
        for (int i = 0; i < NB; i++) {
            // Si encontramos MAYA en B, cambiamos la bandera
            if (B[i] == MAYA) {
                mayaEnB = true;
                break; // Salimos del ciclo porque ya lo encontramos
            }
        }
        
        // Mostramos el resultado de la busqueda
        if (mayaEnB) {
            System.out.println("MAYA SI se encuentra en B");
        } else {
            System.out.println("MAYA NO se encuentra en B");
        }
        
        // PASO 6: Verificar si MENB se encuentra en el vector A
        // Bandera para indicar si encontramos MENB en A
        boolean menbEnA = false;
        
        // Buscamos MENB en todos los elementos de A
        for (int i = 0; i < NA; i++) {
            // Si encontramos MENB en A, cambiamos la bandera
            if (A[i] == MENB) {
                menbEnA = true;
                break; // Salimos del ciclo porque ya lo encontramos
            }
        }
        
        // Mostramos el resultado de la busqueda
        if (menbEnA) {
            System.out.println("MENB SI se encuentra en A");
        } else {
            System.out.println("MENB NO se encuentra en A");
        }
        
        // PASO 7: Determinar que operacion hacer y crear el vector C
        // Primero determinamos el tamaño del vector resultante C
        // Usamos el mayor tamaño entre A y B para no perder elementos
        int tamañoC = Math.max(NA, NB);
        int[] C = new int[tamañoC];
        
        // Verificamos la condicion para decidir la operacion
        if (MAYA >= MENB) {
            System.out.println("\nMAYA >= MENB, por lo tanto realizamos C = A + B");
            
            // Realizamos la suma elemento por elemento
            for (int i = 0; i < tamañoC; i++) {
                // Obtenemos el valor de A en la posicion i, o 0 si no existe
                int valorA = 0;
                if (i < NA) {
                    valorA = A[i];
                }
                
                // Obtenemos el valor de B en la posicion i, o 0 si no existe
                int valorB = 0;
                if (i < NB) {
                    valorB = B[i];
                }
                
                // Sumamos ambos valores y lo guardamos en C
                C[i] = valorA + valorB;
            }
            
        } else {
            System.out.println("\nMAYA < MENB, por lo tanto realizamos C = A - B");
            
            // Realizamos la resta elemento por elemento
            for (int i = 0; i < tamañoC; i++) {
                // Obtenemos el valor de A en la posicion i, o 0 si no existe
                int valorA = 0;
                if (i < NA) {
                    valorA = A[i];
                }
                
                // Obtenemos el valor de B en la posicion i, o 0 si no existe
                int valorB = 0;
                if (i < NB) {
                    valorB = B[i];
                }
                
                // Restamos valorB de valorA y lo guardamos en C
                C[i] = valorA - valorB;
            }
        }
        
        // PASO 8: Mostrar el vector resultante C
        System.out.println("\nVector resultante C:");
        System.out.print("C = [");
        
        // Mostramos cada elemento de C
        for (int i = 0; i < tamañoC; i++) {
            System.out.print(C[i]);
            
            // Agregamos coma excepto en el ultimo elemento
            if (i < tamañoC - 1) {
                System.out.print(", ");
            }
        }
        
        System.out.println("]");
    }
}