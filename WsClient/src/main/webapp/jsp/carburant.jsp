<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@page import="jaxWs.persistance.Carburant"%>
<%@page import="java.util.List"%>
<%
List<Carburant> carburants = (List<Carburant>) request.getAttribute("carburants");
%>
<%
Carburant carburant = (Carburant) request.getAttribute("carburant");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>gestion des carburant</title>
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
				<c:if test="${empty carburant}">
					<div class="col-lg-4 mt-4">
						<form method="post" action="StationServlet??action=ajouterCar" class="card">
							<div class="form-group">
								<label for="nom">Nom carburant</label> <input type="text"
									name="nom" class="form-control" 
									placeholder="Entrer le nom du carburant">
							</div>
							<div class="form-group">
								<label for="prenom">designation Carburant</label> <input type="text"
									name="designation" class="form-control" 
									placeholder="Entrer l'adresse du station">
							</div>
							
							<input type="submit" class="btn btn-primary mb-2 mt-3"
								value="Ajouter">
						</form>
					</div>
				</c:if>
				<c:if test="${not empty carburant}">
					<div class="col-lg-4 mt-4">
						<form method="post" action="StationServlet?action=editCar" class="card">
							<div class="form-group">
								<label for="nom">Nom carburant</label> <input type="text"
									name="nom" class="form-control" id="nom"
									placeholder="Entrer le nom du carburant"
									value="${ carburant.getNom()}">
							</div>
							<div class="form-group">
								<label for="prenom">designation Station</label> <input type="text"
									name="addrr" class="form-control" id="prenom"
									placeholder="Entrer la designation du carburant"
									value="${ carburant.getAdress()}">
							</div>
							<input type="hidden" id="id" name="codeCli"
								value="${carburant.getCodeCar()}"> <input type="submit"
								class="btn btn-warning mb-2 mt-3" value="Update">
							
						</form>
					</div>
				</c:if>

				<div class="col-lg-6 mt-4">
					<table class="table" class="card">
						<thead class="card-header">
							<tr>
								<th scope="col">Nom</th>
								<th scope="col">designation</th>
								<th scope="col">action</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${carburants}" var="carburant">
								<tr>
									<td>${carburant.getNom()}</td>
									<td>${carburant.getDescription()}</td>
								
									<td><a
										href="StationServlet?action=deleteC&code=${carburant.getCodeSta()}"
										class="btn btn-danger">Delete</a><a
										href="StationServlet?action=updateC&code=${carburant.getCodeSta()}"
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