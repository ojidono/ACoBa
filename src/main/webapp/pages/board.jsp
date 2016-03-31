<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<h1>Tableau récapitulatif</h1>


<div>
	<!-- Nav tabs -->
	<ul class="nav nav-tabs" role="tablist" id="myTabs">
		<li role="presentation"><a href="#semaine"
			aria-controls="semaine" role="tab" data-toggle="tab">Semaine</a></li>
		<li role="presentation"><a href="#mois" aria-controls="mois"
			role="tab" data-toggle="tab">Mois</a></li>
		<li role="presentation"><a href="#annee" aria-controls="annee"
			role="tab" data-toggle="tab">Année</a></li>
		<form>
			<li role="presentation"><label for="dateDebut">de : </label> <input
				type="text" id="dateDebut" name="dateDebut"> <label
				for="dateFin"> à : </label> <input type="text" id="dateFin"
				name="dateFin"> <input type="submit" value="OK"
				class="btn btn-xs btn-info"></li>
		</form>
	</ul>

	<!-- Tab panes -->
	<div class="tab-content">
		<div role="tabpanel" class="tab-pane fade" id="semaine">
			<h1>Semaine</h1>
		</div>

		<div role="tabpanel" class="tab-pane fade" id="mois">
			<h1>Mois</h1>
		</div>

		<div role="tabpanel" class="tab-pane fade" id="annee">
			<h1>Année</h1>
		</div>

		<div role="tabpanel" class="tab-pane fade" id="settings">...</div>
	</div>

</div>