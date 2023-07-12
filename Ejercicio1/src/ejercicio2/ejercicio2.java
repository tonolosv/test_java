/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

public class ejercicio2 {
    static final double imp = 0.13;
    static double impuesto (double monto){
    return monto * imp;
}
public static void main(String[] args){
    System.out.println("Impuesto de 1000: " + String.valueOf(impuesto (10000)));
}
}
