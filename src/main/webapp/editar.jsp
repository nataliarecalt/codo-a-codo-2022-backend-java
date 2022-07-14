<%@page import="ar.com.codoacodo.dto.Producto"%>
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
					<% 
					  	Producto producto = (Producto)request.getAttribute("producto");
				  	%>
					<h2 style="color: white" align="center"> <br> Editar producto ID: <%=producto.getIdProducto()%></h2>
					<!--  JSP -->
					<form method="POST"
						action="<%=request.getContextPath()%>/api/EditarController">
						<br>
						<div class="mb-3" style="color: white">
							<input name="nombre" value="<%=producto.getNombre()%>" type="text" class="form-control" id="exampleFormControlInput1" placeholder="Nombre" maxlength="50" style="width: 600px; heigth: 1px">
						</div>
						<div class="mb-3" style="color: white">
							<input name="nombre" value="<%=producto.getPrecio()%>" type="text" class="form-control" id="exampleFormControlInput1" placeholder="Nombre" maxlength="50" style="width: 600px; heigth: 1px">
						</div>
						<div class="mb-3" style="color: white">
						  	<input name="imagen" type="file" class="form-control" id="exampleFormControlTextarea1" maxlength="50" style="width: 600px; heigth: 1px">
						</div>
						<div class="mb-3" style="color: white">
							<input name="nombre" readonly="readonly" value="<%=producto.getCodigo()%>" type="text" class="form-control" id="exampleFormControlInput1" placeholder="Nombre" maxlength="50" style="width: 600px; heigth: 1px">
						</div>
						<button class="btn btn-outline-success" style="color: #12C176">
							Finalizar Edici&oacute;n
						</button>
					</form>
				</section>
			</div>
		</main>
	</body>	
</html>
