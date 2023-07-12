package Ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
    

static void funcionVector(){
    int vector[] = new int[5];
    int i;
    Scanner scanner = new Scanner(System.in);
    for(i=0; i<5; i++){
        System.out.println("Digite el valor de la posicion " + String.valueOf(i) + " ");
        vector[i] = scanner.nextInt();
    }
    //
    for(i=0; i<5; i++)
        System.out.println("i : " + String.valueOf(i)+ " es" + String.valueOf(vector[i]));
    //
    int mayor = vector[0];
    for (i = 1;i<5; i++) {
        if(vector[i]>mayor) mayor=vector[i];
        System.out.println("El valor mayor vector es: "+ String.valueOf(mayor));
    }
    public static void main(String [] args){
        funcionVector();
    }
}

