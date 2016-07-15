/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4_5;

import java.util.Objects;

/**
 *
 * @author SPPDF
 */
public abstract class Figura {
    protected String color;

    public Figura(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    abstract protected Float area();
    
    abstract protected Figura getNewFigura();
    
    public static void mostrarFigura(Figura fg){
        System.out.println("El area de tu figura es:");
        System.out.println(fg.area());
        System.out.println("El color de tu figura es:");
        System.out.println(fg.color);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.color);
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
        final Figura other = (Figura) obj;
        if (!Objects.equals(this.color, other.color)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Figura{" + "color=" + color + '}';
    }
    
}
