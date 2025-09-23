/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oper_mat;

/**
 *
 * @author amirs
 */
public class Oper_mat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        matriz A = new matriz();
        matriz B = new matriz();
        matriz C = new matriz();
        matriz D = new matriz();
        matriz E = new matriz();
        operaciones op = new operaciones();
        System.out.println("Ingrese lo valores de A");
        A = op.lectura();
        System.out.println("Ingrese lo valores de B");
        B = op.lectura();
        System.out.println("Ingrese lo valores de C");
        C = op.lectura();
        System.out.println("La matriz A es la siguiente: ");
        op.escritura(A);
        System.out.println("La matriz B es la siguiente: ");
        op.escritura(B);
        System.out.println("La matriz C es la siguiente: ");
        op.escritura(C);
        int sdpa,sdpb;
        sdpa=op.spd(A);
        sdpb=op.spd(B);
        if(sdpa==op.sdiv(sdpb)&&sdpb==op.sdiv(sdpa)){
            E=op.multip(A,B);
            D=op.suma_resta(E,C,-1);
        }else{
            E=op.suma_resta(A,B,-1);
            D=op.multip(E,D);
            
        }
        System.out.println("La matriz resultante es: ");
        op.escritura(D);
    }

}
