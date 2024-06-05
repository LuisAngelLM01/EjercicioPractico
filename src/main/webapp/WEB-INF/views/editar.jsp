<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Editar Moneda</title>
    <link rel="stylesheet" type="text/css" href="css/styles.css">
</head>
<body>
    <h1>Editar Moneda</h1>
    
    <form action="/api/monedas/${numCia}/${claveMoneda}" method="post">
        <label for="numCia">Num Cia:</label>
        <input type="text" id="numCia" name="numCia" value="${numCia}" readonly><br>
        
        <label for="claveMoneda">Clave Moneda:</label>
        <input type="text" id="claveMoneda" name="claveMoneda" value="${claveMoneda}" readonly><br>
        
        <label for="descripcion">Descripción:</label>
        <input type="text" id="descripcion" name="descripcion" value="${descripcion}"><br>
        
        <label for="simbolo">Símbolo:</label>
        <input type="text" id="simbolo" name="simbolo" value="${simbolo}"><br>
        
        <label for="abreviacion">Abreviación:</label>
        <input type="text" id="abreviacion" name="abreviacion" value="${abreviacion}"><br>
        
        <label for="monedaCorriente">Moneda Corriente:</label>
        <input type="text" id="monedaCorriente" name="monedaCorriente" value="${monedaCorriente}"><br>
        
        <label for="status">Status:</label>
        <input type="text" id="status" name="status" value="${status}"><br>
        
        <input type="submit" value="Guardar Cambios">
    </form>
</body>
</html>
