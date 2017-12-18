<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Formulario de Registro de citas</title>
        <link href="<c:url value='/statics/css/bootstrap.css' />"  rel="stylesheet"></link>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>


        <style>

            .error {
                color: #ff0000;
            }
        </style>

    </head>

    <body>

    <center> <h2>Programar Cita</h2></center>

    <form:form class="form-horizontal" role="form" method="POST" modelAttribute="cita">
        <form:input type="hidden" path="idcitas" id="idcitas"/>
        <center> <table>
                <tr>
                <div class="form-group">
                   <label for="Descripcion"  class="col-lg-2 control-label" >Descripcion: </label> 
                        <div class="col-lg-8">
                    <form:input  type="text" class="form-control" placeholder="Campo de texto" path="descripcioncita" id="descripcioncita"/>
                    <form:errors path="descripcioncita" cssClass="error"/> 
                </div><div class="col-lg-3"></div>
                </div>
                </tr>
                <tr>
                <div class="form-group">
                    <label for="joiningDate" class="col-lg-2 control-label">Fecha: </label> 
                        <div class="col-lg-8">
                    <form:input  class="form-control" placeholder="Campo de texto"  path="fechacita" id="fechacita"/>
                    <spring:eval expression="cita.fechacita" />
                    <form:errors path="fechacita" cssClass="error"/></div>
<div class="col-lg-3"></div>
                </div>
                     </tr>
<tr>
                <div class="form-group">
                  <label for="Nombre"class="col-lg-2 control-label">Nombre: </label> 
                  <div class="col-lg-8">
                    <form:input type="text" class="form-control" placeholder="Campo de texto" path="nombredoctorcita" id="nombredoctorcita"/>
                    <form:errors path="nombredoctorcita" cssClass="error"/>
                    </div>
                    <div class="col-lg-3"></div>
                </div>
<tr>
                <div class="form-group">
                   <label for="Tipo"class="col-lg-2 control-label">Tipo: </label> 
                   <div class="col-lg-8">
                   <form:input type="text" class="form-control" placeholder="Campo de texto" path="tipocita" id="tipocita"/>
                    <form:errors path="tipocita" cssClass="error"/>
                   </div><div class="col-lg-3"></div>
                </div>
                 </tr>
                <tr>
                <div class="form-group">
                   <label for="Estado"class="col-lg-2 control-label">Estado: </label> 
                      <div class="col-lg-8">
                    <form:input type="text" class="form-control" placeholder="Campo de texto" path="estadocita" id="estadocita"/>
                   <form:errors path="estadocita" cssClass="estadocita"/>
                </div><div class="col-lg-3"></div>
                </div>
                 </tr>
                <tr>
                <div class="form-group">

                    <c:choose>
                        <c:when test="${edit}">
                         <td>     <input type="submit" value="Update"/> </td> 
                        </c:when>
                        <c:otherwise>
                            <div class="form-actions">
                                <td></td>  <td>   <input type="submit" class="btn btn-block btn-primary btn-default" value="Registrar"> </td> 
                            </div>
                        </c:otherwise>
                    </c:choose>

                </div>
                </tr>
            </table></center>
        </form:form>
    <br/>
    <br/>
    Go back to <a href="<c:url value='/admin' />">Lista de Citas</a>
</body>
</html>
