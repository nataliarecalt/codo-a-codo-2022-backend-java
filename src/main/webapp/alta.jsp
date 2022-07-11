<html>
	<head>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
	</head>
	
	<body style="background-color:#000000">
		<main>
			<!-- ACA VA EL NAVBAR  -->
			<%@include file="navbar.jsp" %>
			<div class="container" align="center">
				<section>
					<h1 style="color: white" align="center"> <br> Alta de productos<br><br></h1>
					<!--  JSP -->
					<form method="post"
						action="<%=request.getContextPath()%>/CreateController">
						<div class="mb-3" style="color: white" >
						  <input name="nombre" type="text" class="form-control" id="exampleFormControlInput1" placeholder="Nombre" maxlength="50" style="width: 600px; heigth: 1px">
						</div>
						<div class="mb-3" style="color: white">
						  <input name="precio" type="number" class="form-control" id="exampleFormControlTextarea1" placeholder="Precio" style="width: 600px; heigth: 1px">
						</div>
						<div class="mb-3" style="color: white">
						  <input name="imagen" type="file" class="form-control" id="exampleFormControlTextarea1" style="width: 600px; heigth: 1px">
						</div>
						<div class="mb-3" style="color: white">
						  <input name="codigo" type="text" class="form-control" id="exampleFormControlTextarea1" maxlength="7" placeholder="Código" style="width: 600px; heigth: 1px">
						</div>
						<br>
						<button type="button" class="btn btn-outline-secondary">Dar de alta</button>
					</form>
				</section>
			</div>
		</main>
	</body>	
</html>
