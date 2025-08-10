// =====================
        // VECTORES: 
        // Ejercicio 1:
        // Encontrar TODOS los números que aparecen más de una vez en un arreglo
        // =====================
public class Ex_01 {
    public static void main(String[] args) {
        
        // Definimos el arreglo con algunos números repetidos (lo pueden cambiar y probar)
        int[] numeros = { 3, 1, 4, 1, 5, 5, 2, 6, 5, 3, 5 };

        // Variable para saber si encontramos duplicados en el arreglo
        boolean encontreDuplicados = false;

        // Primer bucle: recorremos cada elemento del arreglo
        for (int i = 0; i < numeros.length; i++) {
            // Esta variable sirve para saber si ya mostramos este número antes
            boolean yaLoMostramos = false;

            // Segundo bucle: revisamos si el número actual ya fue mostrado
            for (int k = 0; k < i; k++) {
                if (numeros[k] == numeros[i]) {
                    // Si encontramos que ya lo mostramos, marcamos la bandera y salimos del bucle
                    yaLoMostramos = true;
                    break;
                }
            }

            // Si NO lo hemos mostrado antes, procedemos a contar cuántas veces aparece
            if (!yaLoMostramos) {
                int contador = 0;

                // Tercer bucle: contar todas las apariciones del número actual
                for (int j = 0; j < numeros.length; j++) {
                    if (numeros[i] == numeros[j]) {
                        contador++;
                    }
                }

                // Si aparece más de una vez, mostramos el resultado
                if (contador > 1) {
                    System.out.println("El número " + numeros[i] +
                            " aparece " + contador + " veces en el arreglo.");
                    encontreDuplicados = true; // Marcamos que sí hubo duplicados
                }
            }
        }

        // Si no encontramos ningún duplicado, mostramos mensaje
        if (!encontreDuplicados) {
            System.out.println("No hay números duplicados en el arreglo.");
        }
    }
}
