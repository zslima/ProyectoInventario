/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.inventario.modelo;

/**
 *
 * @author juan
 */
public class Componente {
    private int idcomp;
    private String nombre;
    private int estado;
    private int idcat;

    public Componente() {
    }

    public Componente(int idcomp, String nombre, int estado, int idcat) {
        this.idcomp = idcomp;
        this.nombre = nombre;
        this.estado = estado;
        this.idcat = idcat;
    }

    public int getIdcomp() {
        return idcomp;
    }

    public void setIdcomp(int idcomp) {
        this.idcomp = idcomp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getIdcat() {
        return idcat;
    }

    public void setIdcat(int idcat) {
        this.idcat = idcat;
    }
    
    
}
