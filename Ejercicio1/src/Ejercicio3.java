import java.util.Scanner;

public class Ejercicio3 {
static String dia (int ndia){
    String nomdia = "dia..!";
    switch(ndia){
        case 1: nomdia = "Lunes"; break;
        case 2: nomdia = "Martes"; break;
        case 3: nomdia = "Miercoles"; break;
        case 4: nomdia = "Jueves"; break;
        case 5: nomdia = "Viernes"; break;
        case 6: nomdia = "Sabado"; break;
        case 7: nomdia = "Domingo"; break;
    }
    return (nomdia);
}
public static void main (String [] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite un numero de dia: ");
    int dia = scanner.nextInt();
    System.out.println("El dia es " + dia(dia));
}
}
