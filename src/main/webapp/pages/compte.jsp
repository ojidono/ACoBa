<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<h1>Mes Comptes</h1>

<table>
	<tr>
		<td>Id</td>
		<td>Nom</td>
		<td>Actions</td>
	</tr>

</table>

<button type="button" class="btn btn-primary btn-lg" data-toggle="modal"
	data-target="#ajouterCompte">Ajouter un compte</button>

<!-- Modal -->
<div class="modal fade" id="ajouterCompte" tabindex="-1" role="dialog"
	aria-labelledby="myModalLabel">
	<div class="modal-dialog" role="document">
		<div class="modal-content">
			<c:url var="saveCompte" value="/api/compte/save" />
			<form:form action="${saveCompte}" commandName="compte" method="POST">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">Ajouter un compte</h4>
				</div>
				<div class="modal-body">

					<div class="form-group">
						<label for="nom">Nom</label> 
						<input type="email" class="form-control" id="nom" placeholder="Nom du compte">
					</div>

				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
					<button type="button" class="btn btn-primary">Ajouter</button>
				</div>
			</form:form>
		</div>
	</div>
</div>
