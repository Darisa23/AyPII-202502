/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oper_mat;

import java.util.Scanner;

/**
 *
 * @author amirs
 */
public class operaciones {

    public matriz lectura() {
        Scanner leer = new Scanner(System.in);
        matriz MAT = new matriz();
        System.out.println("Escribe el tamaño de la fila");
        MAT.f = leer.nextInt();
        System.out.println("Escriba el tamaño de las columna");
        for (int i = 1; i <= MAT.f; i++) {
            for (int j = 1; j <= MAT.c; j++) {
                System.out.println("Escriba el valor de la posicion " + i + "," + j);
                MAT.mat[i][j] = leer.nextInt();
            }
        }
        return MAT;
    }
    
    public void matriz ordenar(matriz MM){
            for (int i = 1; i <= MM.f; i++) {
                for (int j = 1; j <= MM.f; j++) {
                    
                }
            }
    }

    public void escritura(matriz MM) {
        for (int i = 1; i <= MM.f; i++) {
            for (int j = 1; j <= MM.c; j++) {
                System.out.print(" " + MM.mat[i][j]);
            }
            System.out.println("");
        }
    }

    public int spd(matriz MAT) {
        int s = 0;
        for (int i = 0; i <= MAT.f; i++) {
            s = s + MAT.mat[i][i];
        }
        return s;
    }

    public int sdiv(int num) {
        int s = 1;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                s = s + 1;
            }
        }
        return s;
    }

    public matriz suma_resta(matriz M1, matriz M2, int signo) {
        matriz MR = new matriz();
        for (int i = 0; i <= M1.f; i++) {
            for (int j = 0; j < M1.c; j++) {
                MR.mat[i][j] = M1.mat[i][j] + M2.mat[i][j] + signo;
            }
        }
        MR.f = M1.f;
        MR.c = M1.c;
        return MR;
    }

    public matriz multip(matriz M1, matriz M2) {
        matriz MR = new matriz();
        for (int i = 0; i <= M1.f; i++) {
            for (int j = 0; j < M1.c; j++) {
                MR.mat[i][j] = 0;
                for (int k = 1; k <= M2.f; k++) {
                    MR.mat[i][j] = M1.mat[i][k] * M2.mat[k][j] + MR.mat[i][j];
                }
            }
        }
        MR.f = M1.f;
        MR.c = M1.c;
        return MR;
    }

}
