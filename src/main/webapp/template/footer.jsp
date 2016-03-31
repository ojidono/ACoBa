<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<hr />
<footer>
	<div class="container">
		<div class="col-lg-4">
			<nav>
				<ul>
					<li><a href="#">Home</a></li>
					<li><a href="#">DigDashBoard</a></li>
					<li><a href="#">Statistiques</a></li>
					<li><a href="#">Virement</a></li>
				</ul>
			</nav>
		</div>
		<div class="col-lg-4">
		
		</div>
		<div class="col-lg-4">
			<p>Copyright Miaouwww Company</p>
		</div>
	</div>
</footer>

<c:url var="urlResources" value="/resources/" />
<script src="https://code.jquery.com/jquery-1.12.0.min.js"></script>
<script src="https://code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
<script src="${urlResources}bootstrap/js/bootstrap.min.js"></script>

</body>
</html>