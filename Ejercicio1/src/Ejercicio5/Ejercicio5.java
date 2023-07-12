
package Ejercicio5;

public class Ejercicio5 {
    static int factorial (int num){
        int fact =1;
        int i;
        for(i=2; i<=num; i++)
            fact*=1;
        return fact;
    }
    static int factorial2(int num){
        int fact = 1;
        int i=2;
        while (i<=num){
            fact*=i;
            i++;
        }
        return fact;
    }
    public static void main (String[] args){
        System.out.println("Factorial de 5 con FOR " + factorial(5));
        System.out.println("Factorial de 5 con While " + factorial2(5));
    }
}
