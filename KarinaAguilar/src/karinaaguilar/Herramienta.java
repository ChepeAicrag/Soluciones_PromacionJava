/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karinaaguilar;

/**
 *
 * @author García García José Ángel
 */
public class Herramienta {

    private Material tipo;
    private int durabilidad;

    public Herramienta(String tipo, int durabilidad) {
        this.tipo = new Material(tipo);
        // Verificamos que la durabilidad sea mayor o igual a 0
        if (durabilidad >= 0) {
            this.durabilidad = durabilidad;
        }
    }

    public void setTipo(String tipo) {
        this.tipo.setTipo(tipo);
    }

    public void setDurabilidad(int durabilidad) {
        if (this.durabilidad == 0 && durabilidad > 0) {
            this.durabilidad = durabilidad;
        } else if (durabilidad > 0 && durabilidad < this.durabilidad) {
            this.durabilidad = durabilidad;
        }
    }

    public Material getTipo() {
        return tipo;
    }

    public int getDurabilidad() {
        return durabilidad;
    }
}
