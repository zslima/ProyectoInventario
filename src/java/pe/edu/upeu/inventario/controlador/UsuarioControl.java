/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.inventario.controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import pe.edu.upeu.inventario.dao.UsuarioDAO;
import pe.edu.upeu.inventario.interfaces.InterfaceUsuario;
import pe.edu.upeu.inventario.modelo.Usuario;

/**
 *
 * @author juan
 */
public class UsuarioControl extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        InterfaceUsuario aO = new UsuarioDAO();
        Usuario us = new Usuario();
        HttpSession session = request.getSession(true);
        RequestDispatcher dispatcher; String pagina;
        String op = request.getParameter("op"); int id;
        switch(Integer.parseInt(op)){
            case 1: pagina = "/vista/usuario/ListarUsuario.jsp";
                    session.setAttribute("list1", aO.list());
                    dispatcher = getServletContext().getRequestDispatcher(pagina);
                    dispatcher.forward(request, response);
            case 2: pagina = "/vista/usuario/IngresarUsuario.jsp";
                    //session.setAttribute("list", aO.list());
                    dispatcher = getServletContext().getRequestDispatcher(pagina);
                    dispatcher.forward(request, response);
            case 3: pagina = "/vista/usuario/ModificarUsuario.jsp";
                    id = Integer.parseInt(request.getParameter("id"));
                    session.setAttribute("list2", aO.list(id));
                    dispatcher = getServletContext().getRequestDispatcher(pagina);
                    dispatcher.forward(request, response);
            case 4: pagina = "/usuar?op=1";
                    us.setIdusuario(Integer.parseInt(request.getParameter("id")));
                   
                    us.setUsuario(request.getParameter("usuario"));
                    us.setClave(request.getParameter("clave"));
                    us.setIdPersona(Integer.parseInt(request.getParameter("idPersona")));
                    if(aO.edit(us)){
                    dispatcher = getServletContext().getRequestDispatcher(pagina);
                    dispatcher.forward(request, response);
                    }else{
                        out.println("<h3>Error al modificar registro..!!</h3>");
                    }
            case 5: pagina = "/usuar?op=1";
                   
                    us.setUsuario(request.getParameter("usuario"));
                    us.setClave(request.getParameter("clave"));
                    us.setIdPersona(Integer.parseInt(request.getParameter("idPersona")));
                    if(aO.save(us)){
                    dispatcher = getServletContext().getRequestDispatcher(pagina);
                    dispatcher.forward(request, response);
                    }else{
                        out.println("<h3>Error AL guardar registro..!!</h3>");
                    }
            case 6: pagina = "/usuar?op=1";
                    id = Integer.parseInt(request.getParameter("id"));
                    if(aO.delete(id)){
                    dispatcher = getServletContext().getRequestDispatcher(pagina);
                    dispatcher.forward(request, response);
                    }else{
                        out.println("<h3>Error al eliminar registro..!!</h3>");
                    }    
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
