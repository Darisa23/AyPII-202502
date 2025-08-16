package Ejercicios_Laboratorios;

import java.util.Scanner;

/**
 * Ejercicio laboratorio del 12 de Agosto:
 * Clase ARRAYS: 
 * Permite trabajar con operaciones entre arreglos (vectores) como unión, intersección,
 * complemento y producto punto.
 */
public class ARRAYS {

    // ATRIBUTOS:
    // Los arreglos tienen tamaño máximo fijo para evitar problemas.
    int a[] = new int[21];
    int b[] = new int[21];
    int c[] = new int[42];              // Unión de A y B
    int intersec[] = new int[42];       // Intersección entre A y B
    int complemento[] = new int[42];    // Complemento de A respecto a B (A - B)
    
    // Variables:
    int na, nb, nc = 0, ninsec = 0, ncomp = 0;

    
    // MÉTODO DE LECTURA:
    public void lectura() {
        Scanner leer = new Scanner(System.in);

        // Leer el tamaño del arreglo A
        System.out.print("Ingrese el largo deseado del arreglo A: ");
        na = leer.nextInt();

        // leer elementos de A
        for (int i = 1; i <= na; i++) {
            System.out.print("Ingrese el valor del elemento " + i + " de A: ");
            a[i] = leer.nextInt();
        }

        // Leer el tamaño del arreglo B
        System.out.print("Ingrese el largo deseado del arreglo B: ");
        nb = leer.nextInt();

        // Leer elementos de B
        for (int i = 1; i <= nb; i++) {
            System.out.print("Ingrese el valor del elemento " + i + " de B: ");
            b[i] = leer.nextInt();
        }
    }

    // INTERSECCIÓN:
    public void interseccion() {
        // Si A es más largo, se compara A contra B
        if (na >= nb) {
            for (int i = 1; i <= na; i++) {
                for (int j = 1; j <= nb; j++) {
                    if (a[i] == b[j]) {
                        ninsec++;
                        intersec[ninsec] = b[j];
                    }
                }
            }
        } else { // Si B es más largo, se compara B contra A
            for (int i = 1; i <= nb; i++) {
                for (int j = 1; j <= na; j++) {
                    if (b[i] == a[j]) {
                        ninsec++;
                        intersec[ninsec] = a[j];
                    }
                }
            }
        }
    }


    // UNIÓN:
    public void union() {
        // Primero copiamos todos los elementos de A
        for (int i = 1; i <= na; i++) {
            c[i] = a[i];
            nc++;
        }
        // Luego copiamos todos los elementos de B, a continuación de A
        for (int j = na + 1; j <= (nb + na); j++) {
            c[j] = b[j - na];
            nc++;
        }
    }


    // COMPLEMENTO:
    public void complemento() {
        // El complemento aquí lo interpretamos como: elementos de A que NO están en B
        for (int i = 1; i <= na; i++) {
            boolean encontrado = false;
            for (int j = 1; j <= nb; j++) {
                if (a[i] == b[j]) {
                    encontrado = true; // lo encontramos en B
                    break;
                }
            }
            if (!encontrado) { 
                ncomp++;
                complemento[ncomp] = a[i];
            }
        }
    }


    // ESCRITURA_1:
    public void escritura() {
        System.out.println("El vector A es: ");
        for (int i = 1; i <= na; i++) {
            if (i == 1) {
                System.out.print("[ " + a[i]);
            } else if (i < na) {
                System.out.print(" " + a[i]);
            } else {
                System.out.print(" " + a[i] + " ]");
            }
        }
        System.out.println("");

        System.out.println("El vector B es: ");
        for (int j = 1; j <= nb; j++) {
            if (j == 1) {
                System.out.print("[ " + b[j]);
            } else if (j < nb) {
                System.out.print(" " + b[j]);
            } else {
                System.out.print(" " + b[j] + " ]");
            }
        }
        System.out.println("");
    }
    //ESCRITURA_2:
    public void escritura2() {
        System.out.println("El vector C (unión) es: ");
        for (int k = 1; k <= nc; k++) {
            if (k == 1) {
                System.out.print("[ " + c[k]);
            } else if (k < nc) {
                System.out.print(" " + c[k]);
            } else {
                System.out.print(" " + c[k] + " ]");
            }
        }
        System.out.println("");
    }
    //ESCRITURA_3:
    public void escritura3() {
        System.out.println("El vector intersección es: ");
        for (int k = 1; k <= ninsec; k++) {
            if (k == 1) {
                System.out.print("[ " + intersec[k]);
            } else if (k < ninsec) {
                System.out.print(" " + intersec[k]);
            } else {
                System.out.print(" " + intersec[k] + " ]");
            }
        }
        System.out.println("");
    }

     // ================== PRODUCTO PUNTO ==================
    public void productoP() {
        // El producto punto debe ser la suma de las multiplicaciones elemento a elemento
        int resultado = 0;
        int min = Math.min(na, nb); // Por si los vectores no tienen el mismo tamaño
        for (int i = 1; i <= min; i++) {
            resultado = resultado + (a[i] * b[i]);
        }
        System.out.println("El producto punto de A y B es: " + resultado);
    }


    // ESCRITURA DE COMPLEMENTO ==================
    public void escritura4() {
        System.out.println("El vector complemento (A - B) es: ");
        for (int k = 1; k <= ncomp; k++) {
            if (k == 1) {
                System.out.print("[ " + complemento[k]);
            } else if (k < ncomp) {
                System.out.print(" " + complemento[k]);
            } else {
                System.out.print(" " + complemento[k] + " ]");
            }
        }
        System.out.println("");
    }
    
}


