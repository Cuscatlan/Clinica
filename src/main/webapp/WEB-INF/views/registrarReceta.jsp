<%-- 
    Document   : Receta
    Created on : 22-dic-2017, 16:31:59
    Author     : Administrador
--%>
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
            .error { color: #ff0000;}
        </style>

    </head>

    <body>

    <center> <h2>Recetar</h2></center>

    <table class="table table-hover">
        <tr>
            <td>Paciente</td><td>Fecha</td><td>estado</td><td>Tipo</td><td>Doctor</td>
        </tr>
        <tr>
            <td>${cita.paciente.nombrepaciente}</td>
            <td>${cita.fechacita}"</td>
            <td> <c:out value = "${cita.estadocita}"/></td>
            <td> <c:out value = "${cita.tipocita}"/></td>
            <td><c:out value = "${cita.nombredoctorcita}"/></td>

        </tr>
        <tr>
            <td  colspan="5">
                Hallazgos: <c:out value = "${cita.descripcioncita}"/> 
            </td>
        </tr>  
    </table>

    <form:form class="form-horizontal" role="form" method="POST" modelAttribute="receta">
        <form:input type="hidden" path="idreceta" id="idreceta"/>
        <form:input type="hidden" path="citas" id="citas" value="${cita}"/>
        <center> <table class="table table-hover">

                <tr>
                <div class="form-group">
                   
                    <div class="col-lg-8">
                         <label for="joiningDate" class="col-lg-2 control-label">Receta: </label> 
                        <form:input type="text" class="form-control" placeholder="Escriba la prescripcion medica" path="descripcionreceta" id="descripcionreceta"/>
                        <form:errors path="descripcionreceta" cssClass="descripcionreceta"/>
                    </div><div class="col-lg-3"></div>
                </div>
                </tr>

                <tr>
                <div class="form-group">
                    <div class="col-lg-3">
                                            </div>

                        <c:choose>
                            <c:when test="${edit}">
                                <td>     <input type="submit" value="Update"/> </td> 
                                </c:when>
                                <c:otherwise>
                                <div class="form-actions">
                                    <td></td><td></td><td></td><td></td><td></td> <td></td><td>   <input type="submit" class="btn btn-block btn-primary btn-default" value="Recetar"><td></td><td></td><td></td> </td> <td></td><td></td><td></td><td></td>
                                </div>
                            </c:otherwise>
                        </c:choose>
                          <div class="col-lg-3">      
                    </div>
                </div>
                </tr>
            </table></center>
        </form:form>
    <br/>
    <br/>
    Go back to <a href="<c:url value='/admin' />">Lista de Citas</a>
</body>
</html>

