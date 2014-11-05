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
import pe.edu.upeu.inventario.interfaces.InterfaceUsuario;
import pe.edu.upeu.inventario.modelo.Usuario;


/**
 *
 * @author Dka
 */
public class UsuarioDAO implements InterfaceUsuario {
 ConexionBD conn;
    @Override
    public List<Usuario> list() {
        this.conn = FactoryConnectionDB.open(FactoryConnectionDB.MYSQL);
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM usuario");
        List<Usuario> list = new ArrayList<Usuario>();
        try {
            ResultSet rs = this.conn.query(sql.toString());
            while(rs.next()){
            Usuario prov = new Usuario();
            prov.setIdusuario(rs.getInt("idUsuario"));
            
            prov.setUsuario(rs.getString("usuario"));
            prov.setClave(rs.getString("clave"));
            prov.setIdPersona(rs.getInt("idPersona"));
            list.add(prov);
            }
        } catch (SQLException e) {
        } finally{
            this.conn.close();
        }
        return list;
    }

    @Override
    public List<Usuario> list(int id) {
        this.conn = FactoryConnectionDB.open(FactoryConnectionDB.MYSQL);
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM usuario WHERE idUsuario=").append(id);
        List<Usuario> list = new ArrayList<Usuario>();
        try {
            ResultSet rs = this.conn.query(sql.toString());
            while(rs.next()){
            Usuario us = new Usuario();
            us.setIdusuario(rs.getInt("idUsuario"));
            us.setUsuario(rs.getString("usuario"));
            us.setClave(rs.getString("clave"));
            us.setIdPersona(rs.getInt("idPersona"));
            list.add(us);
            }
        } catch (SQLException e) {
        } finally{
            this.conn.close();
        }
        return list;
    }

    @Override
    public boolean edit(Usuario usuario) {
       this.conn = FactoryConnectionDB.open(FactoryConnectionDB.MYSQL);
        boolean save = false;
        try {
            StringBuilder sql = new StringBuilder();
            sql.append("UPDATE usuario SET idUsuario = ").append(usuario.getIdusuario());
            sql.append("', usuario = '").append(usuario.getUsuario());
            sql.append("', clave = '").append(usuario.getClave());
            sql.append("', idPersona = '").append(usuario.getIdPersona()).append("' WHERE idUsuario = ").append(usuario.getIdusuario());
            this.conn.execute(sql.toString());
            save = true;
            //System.out.println(departamento.getDpto());
        } catch (Exception e) {
        }finally{
            this.conn.close();
        }
//        System.out.println(departamento.getIddpto());
//        System.out.println(departamento.getDpto());
//        System.out.println(departamento.getCostos());
//        System.out.println(departamento.getStatus());
        return save;
    }

    @Override
    public boolean save(Usuario usuario) {
        this.conn = FactoryConnectionDB.open(FactoryConnectionDB.MYSQL);
        boolean save = false;
        try {

                StringBuilder sql = new StringBuilder();
                sql.append("INSERT INTO usuario(idUsuario,usuario,clave,idPersona) VALUES(").append("NULL");
               
                sql.append(", '").append(usuario.getUsuario());
                sql.append("', '").append(usuario.getClave());
                sql.append("', '").append(usuario.getIdPersona()).append("')");
              
                this.conn.execute(sql.toString());
                save = true;
        } catch (Exception e) {
            this.conn.close();
        }        
        return save;
    }

    @Override
    public boolean delete(int id) {
           this.conn = FactoryConnectionDB.open(FactoryConnectionDB.MYSQL);
        boolean delete = false;
        try {
            StringBuilder sql = new StringBuilder();
            sql.append("DELETE FROM usuario WHERE idusuario = ").append(id);
            this.conn.execute(sql.toString());
            delete = true;
        } catch (Exception e) {
            
        }finally{
            this.conn.close();
        }
        return delete;
    }

    
    
}
