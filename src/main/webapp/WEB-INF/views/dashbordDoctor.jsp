<%-- 
    Document   : DashbordDoctor
    Created on : 12-04-2017, 01:52:40 PM
    Author     : DELL
--%>
<%-- 
    Document   : usuarios
    Created on : 12-04-2017, 01:20:48 PM
    Author     : DELL
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Menu Principal</title>
        <style>
            tr:first-child{
                font-weight: bold;
                background-color: #C6C9C4;
            }
        </style>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <nav class="navbar navbar-default">
        <div class="container-fluid">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="http://www.cuscatlan.net" target="_blank">Cuscatlan.net</a>
            </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li class="active"><a href="#"> Citas <span class="sr-only">(current)</span></a></li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Mantenimientos <span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a href="<c:url value='/Citas/new'/>">Programar</a></li>
                            <li><a href="<c:url value='/Citas/newE'/>">no Programada</a></li>
                          
                            <li role="separator" class="divider"></li>
                            <li><a href="<c:url value='/Citas/Recetar'/>">Recetar</a></li>
                            <li role="separator" class="divider"></li>
                            <li><a href="#">Asignar Costos</a></li>
                        </ul>
                    </li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Pacientes <span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a href="#">Nuevo</a></li>
                            <li><a href="#">Actualizar</a></li>
                            <li><a href="#">dar de baja</a></li>
                            <li role="separator" class="divider"></li>
                            <li><a href="#">Ver Lista</a></li>
                            <li><a href="#">Consultar</a></li>
                        </ul>
                    </li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Contactos <span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a href="#">Nuevo</a></li>
                            <li><a href="#">Actualizar</a></li>
                            <li><a href="#">dar de baja</a></li>
                            <li role="separator" class="divider"></li>
                            <li><a href="#">Ver Lista</a></li>
                        </ul>
                    </li>
                </ul>
                <form class="navbar-form navbar-left">
                    <div class="form-group">
                        <input type="text" class="form-control" placeholder="Buscar">
                    </div>
                    <button type="submit" class="btn btn-default">Enviar</button>
                </form>
                <ul class="nav navbar-nav navbar-right">
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">${user}<span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a href="#">Configurar</a></li>
                            <li><a href="#">Reportes de Pacientes</a></li>
                            <li><a href="#">Reportes de Consultas</a></li>
                            <li><a href="#">Reportes de Contactos</a></li>
                            <li role="separator" class="divider"></li>
                            <li><a href="#">Log Out</a></li>
                        </ul>
                    </li>
                </ul>
            </div><!-- /.navbar-collapse -->
        </div><!-- /.container-fluid -->
    </nav>
</head>
<body>
    <div id="gtco-hero" class="js-fullheight"  data-section="home">
        <div class="flexslider js-fullheight">
            <ul class="slides">
                <li style="background-image:url(statics/images/Medicina.png)">
                    <div class="overlay"></div>
                    <div class="container">
                        <div class="col-md-11 col-md-offset-1 text-center js-fullheight slider-text " >
                            <div class="slider-text-inner">
                                <div class="gtco-heading">
                                    <div class=" menu-1 main-nav">
                                        <h2 class="gtco-center"><br><br/> </h2>
                                        <h2 class="gtco-center">CUSCATLAN.NET<br/> </h2>
                                        <br><br><br><br><br>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </li>
            </ul>
        </div>
    </div>    
<tr> </tr><tr> </tr><tr> </tr>    
<h2>Consultas por Pacientes</h2>     
</br>
<table class="table table-condensed">
    <tr>
        <td>Nombre</td><td>Fecha</td><td>estado</td><td>Tipo</td><td>Doctor</td><td>Doctor</td>
    </tr>
    
    <c:forEach items="${citas}" var="citas">
        <tr>
            <td>${citas.paciente.nombrepaciente}</td>
            <td>${citas.fechacita}</td>
            <td>${citas.estadocita}</td>
            <td>${citas.tipocita}</td>
            <td>${citas.nombredoctorcita}</td>


            <td><a href="<c:url value='/Citas/edit-${citas.idcitas}-cita' />">Recetar</a></td>
            <td><a href="<c:url value='/Citas/delete-${citas.idcitas}-cita' />">Cancelar</a></td>
        </tr>
    </c:forEach>
</table>
<br/>

<a href="<c:url value='/Citas/new' />">Registrar Cosulta</a>
</body>
</html>