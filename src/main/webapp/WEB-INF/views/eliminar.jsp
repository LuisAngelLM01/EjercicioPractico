<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Eliminar Moneda</title>
    <link rel="stylesheet" type="text/css" href="css/styles.css">
</head>
<body>
    <h1>Eliminar Moneda</h1>
    
    <p>¿Estás seguro de que deseas eliminar la moneda con Num Cia: ${numCia} y Clave Moneda: ${claveMoneda}?</p>
    
    <form action="/api/monedas/${numCia}/${claveMoneda}" method="post">
        <input type="hidden" name="_method" value="DELETE">
        <input type="submit" value="Eliminar">
    </form>
</body>
</html>
