/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estudio;

import java.util.Random;

/**
 *
 * @author Lenovo
 */
public class Estudio {
 static int c;
 static int i;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Estudio s = new Estudio();
        Random rnd = new Random();
        /*
        int[] R = new int[s.c];
        R = s.menores(14);
        for (int n : R) {
            System.out.println(n);
        }
        System.out.println("La suma: "+s.suma(R));     
        System.out.println("promedio: "+s.promedio(R));
        */
        int[] A = new int[4];
        System.out.println("arreglo original");
        for (int j = 0; j < 4; j++) {
            A[j] = rnd.nextInt(10000, 99999);
        }
        
        int[] R = new int[s.i];
         R = s.sol(A, 2);
         System.out.println("I: "+i);
        for (int n : A) {
            System.out.println(n);
        }
        System.out.println("salida");
        for (int l = 0; l < i; l++) {
            System.out.println(R[l]);
        }
    }

    int[] menores(int A) {
        c=0;
        int[] menoresA = new int[A];
        for (int i = 3; i < A; i = i + 3) {
            menoresA[c] = i;
            c++;
        }
        return menoresA;
    }
    int suma(int[] A){
        int resultado = 0;
        for (int n : A) {
            resultado+=n;
        }
        return resultado;
    }
   float promedio(int[] A){
        float resultado = 0;
        for (int n : A) {
            resultado+=n;
        }
        resultado = resultado / c; 
        return resultado;
    }
   
   int [] cifras(int n, int c) {
       int[] r = new int[c];
       for (int i = 1; i <= c; i++){
           r[c-i] = n % 10;
           n = n / 10;
       }
       return r;
   }
   
   boolean contiene(int[] A, int n){
       for (int m : A) {
           if (m ==n ){
             return true;  
           }
       }
       return false;
   }
   
   int[] sol(int[] A, int d) {
       i=0;
       int[] B = new int[A.length];
       for (int n : A) {
            if (this.contiene(cifras(n, 5), d)){
                B[i] = n;
                i++;
            }
        } return B;
   }
}
