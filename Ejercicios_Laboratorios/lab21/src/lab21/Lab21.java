/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab21;

/**
 *
 * @author sdariana
 */
public class Lab21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*FuncNoRec nr = new FuncNoRec();
        nr.leer(3);
        nr.sub_sumar();*/
        FuncRec r = new FuncRec();
        r.leer(3, 0);
        //r.sub_sumar(0, 0);
        int resultado = r.func_sumar(0, 0);
        System.out.println("El resultado usando la función fue: "+resultado);
    }
    
}
