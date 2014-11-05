<%-- 
    Document   : IngresarCategoria
    Created on : 05/11/2014, 04:05:51 PM
    Author     : juan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="pe.edu.upeu.inventario.modelo.Categoria" %>
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
            <strong>REGISTRAR CATEGORIA</strong>
            <hr>
            
            <form role="form" method="get" action="categ">
                
          
                <div class="form-group">
                    <label for="exampleInputEmail1">Nombre:</label>
                    <input type="text" class="form-control" name="nombre" placeholder="Ingresar nombre" autofocus="">
                </div>
                <div class="form-group">
                    <label for="exampleInputEmail1">Descripcion:</label>
                    <input type="text" class="form-control" name="descripcion" placeholder="Ingresar decripcion" autofocus="">
                </div>
               
                <div class="form-group">
                    <label for="exampleInputEmail1">Estdo:</label>
                    <input type="text" class="form-control" name="estado" placeholder="Ingresar estado">
                    <input type="hidden" class="form-control" name="op" value="5">
                </div>
                <div class="form-group">
                    <input type="submit" class="btn btn-warning" value="Resgistrar">
                  
                </div>
            </form>
        </div>
        <%@include file="../../WEB-INF/jspf/bottom.jspf" %>
    </body>
</html>
