/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.inventario.interfaces;

import java.util.List;
import pe.edu.upeu.inventario.modelo.Usuario;

/**
 *
 * @author Dka
 */
public interface InterfaceUsuario {
    public List<Usuario> list();
    public List<Usuario> list(int id);
    public boolean edit(Usuario usuario);
    public boolean save(Usuario usuario);
    public boolean delete(int id);
}
