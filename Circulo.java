/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4_5;

import static java.lang.Math.*;

/**
 *
 * @author SPPDF
 */
public class Circulo extends Figura{
    protected float radio;
    public Circulo(float radio, String color){
        super(color);
        this.radio = radio;
    }
    
    @Override
    protected Float area(){
        return new Float(PI * (radio * 2));
    }
    
    @Override
    protected Circulo getNewFigura(){
        return new Circulo(radio, color);
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Float.floatToIntBits(this.radio);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Circulo other = (Circulo) obj;
        if (Float.floatToIntBits(this.radio) != Float.floatToIntBits(other.radio)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }
    
}
