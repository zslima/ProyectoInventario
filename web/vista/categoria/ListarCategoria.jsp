<%-- 
    Document   : ListarCategoria
    Created on : 29/10/2014, 03:17:10 PM
    Author     : juan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="pe.edu.upeu.inventario.modelo.Categoria" %>
<jsp:useBean id="list1" scope="session" class="java.util.ArrayList"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <%@include file="../../WEB-INF/jspf/estiloPrincpal.jspf" %>
        <%@include file="../../WEB-INF/jspf/jscss1.jspf" %>
        <title>JSP Page</title>
    </head>
    <body>
               <%@include file="../../WEB-INF/jspf/top.jspf" %>
        
        <div class="table-responsive">
            <br>
            <a href="<%= request.getContextPath()%>/categ?op=2" class="btn btn-mini btn-primary" role="button">Nuevo</a>
            <hr>
            <table class="table table-bordered" style="width: 800px;">
                <tr>
                    <th>Id</th>
                  
                    <th>nombre</th>
                    <th>descripcion</th>
                    <th>estado</th>
                    <th></th>
                </tr>
                <% for(int i=0; i<list1.size();i++){
                    Categoria catego = new Categoria();
                    catego = (Categoria)list1.get(i);
                    %>
                <tr>
                    <td><%= catego.getIdcat()%></td>
                    <td><%= catego.getNombre()%></td>
                    <td><%= catego.getDescripcion()%></td>
                    <td><%= catego.getEstado()%></td>
                    <td>
                        <a href="categ?op=3&id=<%= catego.getIdcat()%>" class="btn btn-mini btn-primary" role="button">Editar</a>
                        <a href="categ?op=6&id=<%= catego.getIdcat()%>" class="btn btn-mini btn-primary" role="button">Eliminar</a>
                    </td>
                </tr>
                <%}%>
            </table>
        </div>
        <%@include file="../../WEB-INF/jspf/bottom.jspf" %>
    </body>
</html>
