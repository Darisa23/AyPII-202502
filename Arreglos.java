//EJERCICIOS DE MATRICES Y VECTORES
//Los algoritmos están explicados paso a paso para facilitar el aprendizaje
public class Arreglos {
    public static void main(String[] args) {
//VECTORES:

//1. Encontrar TODOS los números que aparecen más de una vez
int[] numeros = { 3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5 };

// Solución: doble bucle para encontrar duplicados
boolean encontreDuplicados = false;

        for (int i = 0; i < numeros.length; i++) {
            boolean yaLoMostramos = false;

            // Verificar si ya mostramos este número antes
            for (int k = 0; k < i; k++) {
                if (numeros[k] == numeros[i]) {
                    yaLoMostramos = true;
                    break;
                }
            }

            if (!yaLoMostramos) {
                int contador = 0;

                // Contar cuántas veces aparece este número
                for (int j = 0; j < numeros.length; j++) {
                    if (numeros[i] == numeros[j]) {
                        contador++;
                    }
                }

                if (contador > 1) {
                    System.out.println("El número " + numeros[i] +
                            " aparece " + contador + " veces");
                    encontreDuplicados = true;
                }
            }
        }

        if (!encontreDuplicados) {
            System.out.println("No hay duplicados");
        }
    }}

//determina cuáles números del vector están exactamente en la misma posición que su valor
//💡 LECCIÓN: Comparar índice con valor
int[] loteria = { 0, 3, 2, 5, 4, 1, 6, 7, 10, 9 };
        System.out.println("Números: " + Arrays.toString(loteria));
        System.out.print("Posiciones: [");
        for (int i = 0; i < loteria.length; i++) {
            System.out.print(i + (i < loteria.length - 1 ? ", " : ""));
        }
        System.out.println("]");
 boolean hayGanadores = false;
        int premioTotal = 0;

        for (int i = 0; i < loteria.length; i++) {
            if (loteria[i] == i) {
                int premio = (i + 1) * 1000; // Premio basado en posición
                System.out.println("   🎉 ¡GANADOR! Número " + loteria[i] +
                        " en posición " + i + " → Premio: $" + premio);
                hayGanadores = true;
                premioTotal += premio;
            }
        }

        if (hayGanadores) {
            System.out.println("Premio total a repartir: $" + premioTotal);
        } else {
            System.out.println("No hay ganadores");
        }
