<%-- 
    Document   : ModificarCategoria
    Created on : 05/11/2014, 04:47:31 PM
    Author     : juan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="pe.edu.upeu.inventario.modelo.Categoria" %>
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
            <strong>MODIFICAR CATEGORIA</strong>
            <hr>
            <% for(int i=0; i<list2.size();i++){
                    Categoria catego = new Categoria();
                    catego = (Categoria)list2.get(i);
            %>
            <form role="form" method="get" action="categ" >
              
                <div class="form-group">
                    <label for="exampleInputEmail1">Nombre:</label>
                    <input type="text" class="form-control" value="<%= catego.getNombre()%>" name="nombre">
                </div>
                <div class="form-group">
                    <label for="exampleInputEmail1">Descripcion:</label>
                    <input type="text" class="form-control" value="<%= catego.getDescripcion()%>" name="descripcion">
                </div>
                <div class="form-group">
                    <label for="exampleInputEmail1">Estado:</label>
                    <input type="text" class="form-control" value="<%= catego.getEstado()%>" name="estado">
                    <input type="hidden" name="id" value="<%= catego.getIdcat()%>">
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
