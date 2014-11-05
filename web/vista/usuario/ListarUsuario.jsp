<%-- 
    Document   : ListarUsuario
    Created on : 06-oct-2014, 16:10:23
    Author     : Dka
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="pe.edu.upeu.inventario.modelo.Usuario" %>

<jsp:useBean id="list1" scope="session" class="java.util.ArrayList"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="../../WEB-INF/jspf/jscss1.jspf" %>
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="../../WEB-INF/jspf/top.jspf" %>
        
        <div class="table-responsive">
            <br>
            <a href="<%= request.getContextPath()%>/usuar?op=2" class="btn btn-mini btn-success" role="button">Nuevo</a>
            <hr>
            <table class="table table-bordered" style="width: 800px;">
                <tr>
                    <th>Id</th>
                  
                    <th>usuario</th>
                    <th>clave</th>
                    <th>idPresona</th>
                    <th></th>
                </tr>
                <% for(int i=0; i<list1.size();i++){
                    Usuario usuario = new Usuario();
                    usuario = (Usuario)list1.get(i);
                    %>
                <tr>
                    <td><%= usuario.getIdusuario()%></td>
                    <td><%= usuario.getUsuario()%></td>
                    <td><%= usuario.getClave()%></td>
                    <td><%= usuario.getIdPersona()%></td>
                    <td>
                        <a href="usuar?op=3&id=<%= usuario.getIdusuario()%>" class="btn btn-mini btn-success" role="button">Editar</a>
                        <a href="usuar?op=6&id=<%= usuario.getIdusuario()%>" class="btn btn-mini btn-success" role="button">Eliminar</a>
                    </td>
                </tr>
                <%}%>
            </table>
        </div>
        <%@include file="../../WEB-INF/jspf/bottom.jspf" %>
    </body>
</html>
