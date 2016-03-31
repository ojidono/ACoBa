<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>


<h1>Virement</h1>

<form>
	<div class="form-group">
		<label for="source">Compte Source</label> <select class="form-control"
			id="source">
			<option value="1">Compte 1</option>
			<option value="2">Compte 2</option>
			<option value="3">Compte 3</option>
			<option value="4">Compte 4</option>
			<option value="5">Compte 5</option>
		</select>

	</div>
	<div class="form-group">
		<label for="destination">Compte Destination</label> <select
			class="form-control" id="destination">
			<option value="1">Compte 1</option>
			<option value="2">Compte 2</option>
			<option value="3">Compte 3</option>
			<option value="4">Compte 4</option>
			<option value="5">Compte 5</option>
		</select>
	</div>
	<div class="form-group">
		<label for="montant">Montant</label>
		<div class="input-group">
			<span class="input-group-addon">€</span> <input type="text"
				class="form-control" id="montant">
		</div>
	</div>

	<div class="text-right">
		<button type="submit" class="btn btn-success">Valider</button>
	</div>
</form>
