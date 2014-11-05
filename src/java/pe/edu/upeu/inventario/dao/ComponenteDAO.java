/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.inventario.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import pe.edu.upeu.inventario.Factory.ConexionBD;
import pe.edu.upeu.inventario.Factory.FactoryConnectionDB;
import pe.edu.upeu.inventario.interfaces.InterfaceComponente;
import pe.edu.upeu.inventario.modelo.Componente;

/**
 *
 * @author juan
 */
public class ComponenteDAO implements InterfaceComponente{
ConexionBD conn;
    @Override
    public List<Componente> list() {
    this.conn = FactoryConnectionDB.open(FactoryConnectionDB.MYSQL);
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM componente");
        List<Componente> list = new ArrayList<Componente>();
        try {
            ResultSet rs = this.conn.query(sql.toString());
            while(rs.next()){
               
             Componente comp = new Componente();
            comp.setIdcomp(rs.getInt("idComponente"));
            
            comp.setNombre(rs.getString("nombre"));
            comp.setEstado(rs.getInt("estado"));
            comp.setIdcat(rs.getInt("idComponente"));
            list.add(comp);
            }
        } catch (SQLException e) {
        } finally{
            this.conn.close();
        }
        return list;  
    }

    @Override
    public List<Componente> list(int id) {
        this.conn = FactoryConnectionDB.open(FactoryConnectionDB.MYSQL);
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM componente WHERE idComponente=").append(id);
        List<Componente> list = new ArrayList<Componente>();
        try {
            ResultSet rs = this.conn.query(sql.toString());
            while(rs.next()){
            Componente us = new Componente();
            us.setIdcomp(rs.getInt("idComponente"));
            us.setNombre(rs.getString("nombre"));
            us.setEstado(rs.getInt("estado"));
            us.setIdcat(rs.getInt("idCategoria"));
            list.add(us);
            }
        } catch (SQLException e) {
        } finally{
            this.conn.close();
        }
        return list;  }

    @Override
    public boolean edit(Componente componente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean save(Componente componente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
