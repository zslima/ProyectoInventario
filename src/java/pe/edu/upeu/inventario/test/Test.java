/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.inventario.test;

import java.util.List;
import pe.edu.upeu.inventario.dao.UsuarioDAO;
import pe.edu.upeu.inventario.interfaces.InterfaceUsuario;
import pe.edu.upeu.inventario.modelo.Usuario;



public class Test {
    public static void main(String[] args){
        Test test = new Test();
        test.listMYSQL();
       // test.editarmysql();
       //test.deleteMYSQl();
       // test.editarmysql();        
       // test.listMYSQL();
 }
  
    public void listMYSQL(){
        InterfaceUsuario aO = new UsuarioDAO();
        List<Usuario> list = aO.list();
        if(list!=null){
        System.out.println("Listado de usuario");
            for(int i=0;i<list.size();i++){    
            System.out.println("id :"+list.get(i).getIdusuario()+"Usuario:"+list.get(i).getUsuario()+"Clave:"+list.get(i).getClave()+"idPersona:"+list.get(i).getIdPersona());        
            }
        }else{
            System.out.println("falla"); 
        }
   }
    /*public void editarmysql(){
        boolean ab= false;
        InterfaceDepartamento aO1 = new DepartamentoDAO();
        Departamento departamento = new Departamento();
        departamento.setIddpto(1);
        departamento.setDpto("ADRA abs 123");
        departamento.setCostos(100);
        departamento.setStatus(6);
        ab = aO1.edit(departamento);
        System.out.println("id :"+ab); 
    
    }
    public void saveMYSQl(){
        InterfaceProveedor aO = new ProveedorDAO();
        Proveedor proveedor = new Proveedor();
        proveedor.setId(11);
        proveedor.setProv("camilo");
        proveedor.setRuc("1111");
        proveedor.setDir("alameda");
        proveedor.setTel("98980000");
        proveedor.setEst("1");
        aO.save(proveedor);
    }
     public void deleteMYSQl(){
         InterfaceProveedor aO = new ProveedorDAO();
        Proveedor proveedor = new Proveedor();
        aO.delete(4);
    
     }*/
    
}