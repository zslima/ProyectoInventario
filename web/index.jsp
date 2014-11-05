<%-- 
    Document   : index
    Created on : 07-jul-2014, 11:31:10
    Author     : Docente
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="WEB-INF/jspf/jscss1.jspf" %>
        <link type="text/css" href="css/estilos.css" rel="stylesheet">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="WEB-INF/jspf/toplogueo.jspf" %>
        <div>
        <div id="users" ></div><hr>
        <header></header>
            <div id="logueo">
            <form role="form" method="post" action="cindex"> 
            <table> 
                <tr><td><input type="text" name ="nombre" placeholder="ingresar nombre" required autofocus="" class="cajita"></td></tr>
                <tr><td>
       
                <tr><td><input type="submit" name="boton" value="Enviar" class="boton"></tr>
            </table>
        </form>
        </div>
        <div id="mensaje"></div>
        </div>
        <%@include file="WEB-INF/jspf/bottom1.jspf" %>
        <%@include file="WEB-INF/jspf/seg1.jspf" %>
    </body>
</html>
