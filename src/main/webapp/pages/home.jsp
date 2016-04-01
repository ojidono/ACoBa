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
								<li><a class="label label-danger" href="#" id="board">Tableau
										de Bord</a></li>
								<br />
								<li><a class="label label-danger" href="#" id="compte">Mes Comptes</a></li>
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

				<div id="myCarousel" class="carousel slide" data-ride="carousel">
					<!-- Indicators -->
					<ol class="carousel-indicators">
						<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
						<li data-target="#myCarousel" data-slide-to="1"></li>
						<li data-target="#myCarousel" data-slide-to="2"></li>
						<li data-target="#myCarousel" data-slide-to="3"></li>
					</ol>

					<!-- Wrapper for slides -->
					<div class="carousel-inner" role="listbox">
						<div class="item active">
							<img src="/ACoBa/resources/img/photo1.jpg" alt="1" width="608" height="472" class="img-rounded">
						</div>

						<div class="item">
							<img src="/ACoBa/resources/img/photo2.jpg" alt="2" width="608" height="472" class="img-rounded">
						</div>

						<div class="item">
							<img src="/ACoBa/resources/img/photo3.jpg" alt="3" width="608" height="472" class="img-rounded">
						</div>

						<div class="item">
							<img src="/ACoBa/resources/img/photo4.jpg" alt="4" width="608" height="472" class="img-rounded">
						</div>
					</div>

					<!-- Left and right controls -->
					<a class="left carousel-control" href="#myCarousel" role="button"
						data-slide="prev"> <span
						class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
						<span class="sr-only">Previous</span>
					</a> <a class="right carousel-control" href="#myCarousel" role="button"
						data-slide="next"> <span
						class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
						<span class="sr-only">Next</span>
					</a>
				</div>

			</div>
		</div>
	</div>

	<jsp:include page="/template/footer.jsp">
		<jsp:param value="active" name="menuAdministrateurActive" />
		<jsp:param value="Solices - Détails Administrateur" name="titreOnglet" />
	</jsp:include>

	<script>

		$('#board').click(function(e) {
			e.preventDefault();
			$.ajax({
				url : 'board.jsp',
				type : 'GET',
				dataType : 'html',
				success : function(code_html, statut) {
					$('#content').html(code_html);
				}
			});
		});

		$('#compte').click(function(e) {
			e.preventDefault();
			$.ajax({
				url : 'compte.jsp',
				type : 'GET',
				dataType : 'html',
				success : function(code_html, statut) {
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
					$('#content').html(code_html);
				}
			});
		});
	</script>

</body>
</html>