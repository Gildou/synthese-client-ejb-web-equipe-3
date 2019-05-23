<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/bootstrap.css" />
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<form action="ControllerBanque">
			<table>

				<tr>
					<td>Code :</td>
					<td><input type="number" name="code" value="${code}" required /></td>
					<td>${errCode}</td>
					<td><input type="submit" name="action" value="Consulter"></td>
					<td><input type="submit" name="action"
						value="Tous les comptes"></td>
				</tr>
				<tr>
					<td>Montant:</td>
					<td><input type="number" name="montant" value="${montant}"></td>
					<td>${errCode}</td>
					<td><input type="submit" name="action" value="Verser"></td>
					<td><input type="submit" name="action" value="Retirer"></td>
				</tr>

			</table>
		</form>

	</div>
	<div class="container">
		<table class="table table-striped">
			<tr>
				<td>Code:</td>
				<td>${compte.code}</td>
			</tr>
			<tr>
				<td>Solde:</td>
				<td>${compte.solde}</td>
			</tr>
			<tr>
				<td>Date de Création:</td>
				<td>${compte.dateCreation}</td>
			</tr>
		</table>
	</div>
	<div class="container">
		<table class="table table-striped">
			<thead>
				<tr>
					<th>CODE</th>
					<th>SOLDE</th>
					<th>DATE DE CREATION</th>
				</tr>
			</thead>
			<tbody>
				<c:if test="${! empty comptes}">
					<c:forEach items="${comptes}" var="c">
						<tr>
							<td><c:out value="${c.code}" /></td>
							<td><c:out value="${c.solde}" /></td>
							<td><c:out value="${c.dateCreation}" /></td>
						</tr>
					</c:forEach>
				</c:if>
			</tbody>
		</table>

	</div>
</body>
</html>