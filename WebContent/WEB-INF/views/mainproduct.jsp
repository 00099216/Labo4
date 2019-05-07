<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Labo 4 Evaluado</title>
</head>
<body>
	<h1>${message}</h1>
	<form:form action="${pageContext.request.contextPath}/formData" method="POST" modelAttribute="product">

		<label> Nombre: </label>
		<form:input type="text" name="name" path="name"/>
		<form:errors path="name" cssStyle="color:#E81505;"></form:errors><br>

		<label> Marca: </label>
		<form:input type="text" name="brand" path="brand"/>
		<form:errors path="brand" cssStyle="color:#E81505;"></form:errors><br>

		<label> Descripción: </label>
		<form:input type="text" name="description" path="description"/>
		<form:errors path="description" cssStyle="color:#E81505;"></form:errors><br>

		<label> Categoria: </label>
		<form:input type="text" name="category" path="category"/>
		<form:errors path="category" cssStyle="color:#E81505;"></form:errors><br>


		<label> Fecha de expiración: </label>
		<form:input type="date" name="expirationdate" path="expirationdate"/>
		<form:errors path="expirationdate" cssStyle="color:#E81505;"></form:errors><br>

		<label> Precio: </label>
		<form:input type="decimal" name="price" path="price"/>
		<form:errors path="price" cssStyle="color:#E81505;"></form:errors><br><br>


		<input type="submit" value="Agregar producto">
	</form:form>
</body>
</html>