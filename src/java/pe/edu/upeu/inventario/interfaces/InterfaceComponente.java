/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.inventario.interfaces;

import java.util.List;
import pe.edu.upeu.inventario.modelo.Componente;

/**
 *
 * @author juan
 */
public interface InterfaceComponente {
    public List<Componente> list();
    public List<Componente> list(int id);
    public boolean edit(Componente componente);
    public boolean save(Componente componente);
    public boolean delete(int id);
}
