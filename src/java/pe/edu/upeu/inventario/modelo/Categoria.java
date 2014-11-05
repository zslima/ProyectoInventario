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
public class Categoria {
    private int idcat;
    private String nombre;
    private String descripcion;
    private String estado;

    public Categoria() {
    }

    public Categoria(int idcat, String nombre, String descripcion, String estado) {
        this.idcat = idcat;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public int getIdcat() {
        return idcat;
    }

    public void setIdcat(int idcat) {
        this.idcat = idcat;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}

