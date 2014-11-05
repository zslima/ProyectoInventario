<%-- 
    Document   : ModificarUsuario
    Created on : 06-oct-2014, 16:10:43
    Author     : Dka
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="pe.edu.upeu.inventario.modelo.Usuario" %>
<jsp:useBean id="list2" scope="session" class="java.util.ArrayList"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <%@include file="../../WEB-INF/jspf/jscss1.jspf" %>
        <title>JSP Page</title>
     
        <style type="text/css">
            *{
                margin: 0 auto;
            }
            #caja{
                width: 300px;
            }
        </style>
    </head>
    <body>
        <%@include file="../../WEB-INF/jspf/top.jspf" %>
        <div id="caja">
            <strong>MODIFICAR USUARIO</strong>
            <hr>
            <% for(int i=0; i<list2.size();i++){
                    Usuario user = new Usuario();
                    user = (Usuario)list2.get(i);
            %>
            <form role="form" method="get" action="usuar" >
              
                <div class="form-group">
                    <label for="exampleInputEmail1">Usuario:</label>
                    <input type="text" class="form-control" value="<%= user.getUsuario()%>" name="usuario">
                </div>
                <div class="form-group">
                    <label for="exampleInputEmail1">Clave:</label>
                    <input type="text" class="form-control" value="<%= user.getClave()%>" name="clave">
                </div>
                <div class="form-group">
                    <label for="exampleInputEmail1">Estado:</label>
                    <input type="text" class="form-control" value="<%= user.getIdPersona()%>" name="idPersona">
                    <input type="hidden" name="id" value="<%= user.getIdusuario()%>">
                    <input type="hidden" name="op" value="4">
                </div>
                <div class="form-group">
                    <input type="submit" class="btn btn-primary" value="Modificar">
                </div>
            </form>
            <%}%>
        </div>
        <%@include file="../../WEB-INF/jspf/bottom.jspf" %>
    </body>
</html>
