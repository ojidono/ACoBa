<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@
taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>

<html>






<body>

	<jsp:include page="/template/header.jsp">
		<jsp:param value="active" name="menuAdministrateurActive" />
		<jsp:param value="Solices - Détails Administrateur" name="titreOnglet" />
	</jsp:include>

	<div class="container">
		<div class="row">
			<div class="col-sm-3 col-lg-3 col-md-3 col-xs-3">
				<div class="sidebar-nav">
					<div class="navbar navbar-default" role="navigation">
						<div class="navbar-collapse collapse sidebar-navbar-collapse">
							<ul class="nav nav-pills nav-stacked">
								<br />
								<li><a class="label label-danger" href="#">home</a></li>
								<br />
								<li><a class="label label-danger" href="#" id="board">Tableau de Bord</a></li>
								<br />
								<li><a class="label label-danger" href="#">Statistiques</a></li>
								<br />
								<li><a class="label label-danger" href="#" id="virement">Virement</a></li>
								<br />
								<li><a class="label label-danger" href="#">Contact</a></li>
								<br />
							</ul>
						</div>
					</div>
				</div>
			</div>
			<div class="col-sm-9 col-lg-9 col-md-9 col-xs-9" id="content">


			</div>
		</div>
	</div>

	<jsp:include page="/template/footer.jsp">
		<jsp:param value="active" name="menuAdministrateurActive" />
		<jsp:param value="Solices - Détails Administrateur" name="titreOnglet" />
	</jsp:include>

	<script>
		/* SI click sur Id = board ==> affichage board dans content */

		$('#board').click(function(e) {
			e.preventDefault();
			$.ajax({
				url : 'board.jsp',
				type : 'GET',
				dataType : 'html',
				success : function(code_html, statut) {
					//$(code_html).appendTo('#content');
					$('#content').html(code_html);
				}
			});
		});

		$('#virement').click(function(e) {
			e.preventDefault();
			$.ajax({
				url : 'virement.jsp',
				type : 'GET',
				dataType : 'html',
				success : function(code_html, statut) {
					//$(code_html).appendTo('#content');
					$('#content').html(code_html);
				}
			});
		});
		
		
	</script>

</body>
</html>