/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.inventario.modelo;

/**
 *
 * @author Dka
 */
public class Usuario {

    public Usuario() {
    }
    private int idusuario;
    private String usuario;
    private String clave;
    private int idPersona;

    public Usuario(int idusuario, String usuario, String clave, int idPersona) {
        this.idusuario = idusuario;
        this.usuario = usuario;
        this.clave = clave;
        this.idPersona = idPersona;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }


  
    
}
