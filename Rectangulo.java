/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4_5;

/**
 *
 * @author SPPDF
 */
public class Rectangulo extends Figura {
    protected float base;
    protected float altura;

    public Rectangulo(float base, float altura, String color) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    @Override
    protected Float area(){
        return base*altura;
    }
    
    @Override
    protected Rectangulo getNewFigura(){
        return new Rectangulo(base, altura, color);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Float.floatToIntBits(this.base);
        hash = 31 * hash + Float.floatToIntBits(this.altura);
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
        final Rectangulo other = (Rectangulo) obj;
        if (Float.floatToIntBits(this.base) != Float.floatToIntBits(other.base)) {
            return false;
        }
        if (Float.floatToIntBits(this.altura) != Float.floatToIntBits(other.altura)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }
    
    
    
}
