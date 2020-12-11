/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresainformatico;

/**
 *
 * @author dam
 */
public class Trabajador {
    private String nombre;
    private int categoria;
    private float importe;

    public Trabajador(String nombre, int categoria, float importe) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.importe = importe;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public float getImporte() {
        return importe;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }
    
    
}
