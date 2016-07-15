/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4_5;

import java.util.Scanner;

/**
 *
 * @author SPPDF
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        Scanner sc = new  Scanner(System.in);
        sc.useDelimiter("\n");
        int opc;
        float base,altuta,radio;
        String color;
        System.out.println("Elige la figura que quieres crear.");
        do {            
            System.out.println("1.- Triangulo");
            System.out.println("2.- Circulo");
            System.out.println("3.- Rectangulo");
            System.out.println("4.- Salir");
            opc = sc.nextInt();
            switch(opc){
                case 1:
                    System.out.println("Ingrese la base.");
                    base = sc.nextFloat();
                    System.out.println("Ingrese la altura.");
                    altuta = sc.nextFloat();
                    System.out.println("Ingrese el color del triangulo.");
                    color = sc.next();
                    Figura.mostrarFigura(new Triangulo(base, altuta, color));
                    break;
                case 2:
                    System.out.println("Ingrese El radio.");
                    radio = sc.nextFloat();
                    System.out.println("Ingrese el color del Circulo.");
                    color = sc.next();
                    Figura.mostrarFigura(new Circulo(radio, color));
                    break;
                case 3:
                    System.out.println("Ingrese la base.");
                    base = sc.nextFloat();
                    System.out.println("Ingrese la altura.");
                    altuta = sc.nextFloat();
                    System.out.println("Ingrese el color del triangulo.");
                    color = sc.next();
                    Figura.mostrarFigura(new Rectangulo(base, altuta, color));
                    break;
            }
        } while (opc != 4 );
    }
    
}
