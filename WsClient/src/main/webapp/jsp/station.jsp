<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@page import="jaxWs.persistance.Station"%>
<%@page import="java.util.List"%>
<%
List<Station> stations = (List<Station>) request.getAttribute("stations");
%>
<%
Station station = (Station) request.getAttribute("station");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>gestion des stations</title>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/css/bootstrap.min.css">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/css/style.css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
</head>

<body>




	<div id="page-content-wrapper">
		<div class="container-fluid">
			<div class="row">
				<div class="col-lg-2 mt-4"></div>
				<c:if test="${empty station}">
					<div class="col-lg-4 mt-4">
						<form method="post" action="StationServlet?action=ajouterSta" class="card">
							<div class="form-group">
								<label for="nom">Nom station</label> <input type="text"
									name="nomCli" class="form-control" 
									placeholder="Entrer le nom du station">
							</div>
							<div class="form-group">
								<label for="prenom">Adress Station</label> <input type="text"
									name="addrr" class="form-control" 
									placeholder="Entrer l'adresse du station">
							</div>
							
							<input type="submit" class="btn btn-primary mb-2 mt-3"
								value="Ajouter">
						</form>
					</div>
				</c:if>
				<c:if test="${not empty station}">
					<div class="col-lg-4 mt-4">
						<form method="post" action="StationServlet?action=editSta" class="card">
							<div class="form-group">
								<label for="nom">Nom Station</label> <input type="text"
									name="nom" class="form-control" id="nom"
									placeholder="Entrer le nom du station"
									value="${ station.getNom()}">
							</div>
							<div class="form-group">
								<label for="prenom">Adress Station</label> <input type="text"
									name="addrr" class="form-control" id="prenom"
									placeholder="Entrer le prenom du client"
									value="${ station.getAdress()}">
							</div>
							<input type="hidden" id="id" name="codeCli"
								value="${station.getCodeSta()}"> <input type="submit"
								class="btn btn-warning mb-2 mt-3" value="Update">
							
						</form>
					</div>
				</c:if>

				<div class="col-lg-6 mt-4">
					<table class="table" class="card">
						<thead class="card-header">
							<tr>
								<th scope="col">Nom</th>
								<th scope="col">Adress</th>
								<th scope="col">action</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${stations}" var="station">
								<tr>
									<td>${station.getNom()}</td>
									<td>${station.getAdress()}</td>
								
									<td><a
										href="StationServlet?action=deleteSta&code=${station.getCodeSta()}"
										class="btn btn-danger">Delete</a><a
										href="StationServlet?action=updateSta&code=${station.getCodeSta()}"
										class="btn btn-warning">update</a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>


		</div>
	</div>
	<!-- /#page-content-wrapper -->

	</div>
	<!-- /#wrapper -->


</body>
</html>