<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<c:url var="urlResources" value="/resources" />
<!-- core styles -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">

<title>ACoBa</title>
</head>

<body>
	<div class="container">
		<div class="row">
			<div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">
				<div class="jumbotron">
					<div class="container">
						<form action="j_spring_security_check" method="POST">
							<div class="row">
								<div class="col-lg-8 col-md-8 col-xs-8">
									<h1 id="banner">ACoba</h1>
								</div>
							</div>
							<div class="row">
								<div class="col-lg-4 col-md-4 col-xs-4">

									<div>
										<label>Pseudo</label> <input type="text" placeholder="pseudo"
											class="form-control" name="j_username">
									</div>
									<br>
									<div>
										<label>Mot de passe</label> <input type="password"
											id="inputPassword" placeholder="Password" name="j_password"
											class="form-control">
									</div>

								</div>
							</div>
							<br>
							<div class="row">
								<div class="col-lg-8 col-md-8 col-xs-8">
									<button type="submit" class="btn btn-info">Connexion</button>
								</div>
							</div>
						</form>
					</div>
				</div>
			</div>

			<div class="col-lg-4 col-md-4 col-sm-4 col-xs-4"></div>


			<div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">
				<div class="content-wrap clearfix pt15">

					<div class="panel">
						<header class="panel-heading no-b col-lg-offset-2">
							<h1 class="h3 text-primary mt0">
								<spring:message code="create.auteur" text="Créer Auteur" />
							</h1>

							<div class="panel-body">
								<c:url var="createUser" value="/api/user/save" />
								<form:form action="${createUser}" commandName="user"
									method="GET">
									
									<div class="form-group">
										<label for="nom"> <spring:message text="nom" />
										</label>
										<form:input type="text" class="form-control" id="nom"
											path="nom" placeholder="nom" />
									</div>

									<div class="form-group">
										<label for="password"><spring:message text="Mot de passe" /></label>
										<form:input type="password" class="form-control" id="password"
											path="password" placeholder="password" />
										<form:errors path="password" />
									</div>

									<div class="pull-right">
										<a href="<c:url  value="/template/home.jsp" />"
											class="btn btn-default btn-outline">Retour</a>
										<button type="submit" class="btn btn-outline btn-primary">Enregistrer</button>
									</div>
								</form:form>
							</div>
						</header>

					</div>
				</div>
			</div>
		</div>
	</div>
</body>