<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Agregar Nueva Moneda</title>
    <link rel="stylesheet" type="text/css" href="css/styles.css">
</head>
<body>
    <h1>Agregar Nueva Moneda</h1>
    
    <form action="/api/monedas" method="post">
        <label for="numCia">Num Cia:</label>
        <input type="text" id="numCia" name="numCia"><br>
        
        <label for="claveMoneda">Clave Moneda:</label>
        <input type="text" id="claveMoneda" name="claveMoneda"><br>
        
        <label for="descripcion">Descripción:</label>
        <input type="text" id="descripcion" name="descripcion"><br>
        
        <label for="simbolo">Símbolo:</label>
        <input type="text" id="simbolo" name="simbolo"><br>
        
        <label for="abreviacion">Abreviación:</label>
        <input type="text" id="abreviacion" name="abreviacion"><br>
        
        <label for="monedaCorriente">Moneda Corriente:</label>
        <input type="text" id="monedaCorriente" name="monedaCorriente"><br>
        
        <label for="status">Status:</label>
        <input type="text" id="status" name="status"><br>
        
        <input type="submit" value="Guardar">
    </form>
</body>
</html>
