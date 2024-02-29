package com.mycompany.ejercicio_4;
import java.util.Scanner;

public class Ejercicio_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        double numero= scanner.nextDouble();
        double cuadrado= Math.pow((double)numero,2);
        double cubo= Math.pow((double)numero,3);
        //Salidas:
        
        String s_cuadrado= "El cuadrado de "+ numero+" es: "+cuadrado;
        String s_cubo= "El cubo de "+ numero+" es: "+cubo; 
                
        System.out.println(s_cuadrado);
        System.out.println(s_cubo);
        
        scanner.close();
    }
}
