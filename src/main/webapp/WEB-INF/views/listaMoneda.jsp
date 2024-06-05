<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Lista de Monedas</title>
    <link rel="stylesheet" type="text/css" href="/css/styles.css">
</head>
<body>
    <h1>Lista de Monedas</h1>
    
    <!-- Enlace para agregar nueva moneda -->
    <a href="/api/monedas/nueva">Agregar Nueva Moneda</a>
    
    <!-- Tabla para mostrar monedas existentes -->
    <table>
        <tr>
            <th>Num Cia</th>
            <th>Clave Moneda</th>
            <th>Descripción</th>
            <th>Símbolo</th>
            <th>Abreviación</th>
            <th>Moneda Corriente</th>
            <th>Status</th>
            <th>Acciones</th>
        </tr>
        <!-- Aquí se llenarán las filas de la tabla con datos de las monedas -->
        <c:forEach var="moneda" items="${monedas}">
            <tr>
                <td>${moneda.numCia}</td>
                <td>${moneda.claveMoneda}</td>
                <td>${moneda.descripcion}</td>
                <td>${moneda.simbolo}</td>
                <td>${moneda.abreviacion}</td>
                <td>${moneda.monedaCorriente}</td>
                <td>${moneda.status}</td>
                <td>
                    <a href="/api/monedas/${moneda.numCia}/${moneda.claveMoneda}">Ver</a>
                    <a href="/api/monedas/${moneda.numCia}/${moneda.claveMoneda}/editar">Editar</a>
                    <a href="/api/monedas/${moneda.numCia}/${moneda.claveMoneda}/eliminar">Eliminar</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
