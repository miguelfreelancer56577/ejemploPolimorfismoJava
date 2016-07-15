/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4_5;

/**
 *
 * @author miguelfreelancer56577
 */
public class RetornoCovariante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        create first circle
        Circulo cr1 = new Circulo(15.5f, "red");
        System.out.println("first circle: "+cr1);
        System.out.println("color: "+ cr1.getColor());
//        create second circle from the cr1
        Circulo cr2 = cr1.getNewFigura();
//        change any val
        cr2.setColor("blue");
        cr2.setRadio(45);
        System.out.println("Second circle: "+cr2);
        System.out.println("color: "+ cr2.getColor());
    }
    
}
