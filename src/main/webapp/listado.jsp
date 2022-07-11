<%@page import="java.util.List"%>
<%@page import="ar.com.codoacodo.dto.Producto"%>
<html>
	<head>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
	</head>
	
	<body style="background-color:#000000">
		<main>
			<!-- ACA VA EL NAVBAR  -->
			<%@include file="navbar.jsp" %>
			<div class="container">
				<section>
					<h1 style="color: white" align="center"> <br> Listado de productos <br></h1>
					<table class="table" style="color: white">
					  <thead>
					    <tr>
					      <th scope="col">ID</th>
					      <th scope="col">NOMBRE</th>
					      <th scope="col">PRECIO</th>
					      <th scope="col">C&Oacute;DIGO</th>
					      <th scope="col">&nbsp;</th>
					    </tr>
					  </thead>
					  <% 
					  	//codigo java
					  	//obtener el listado desde el request
					  	//se guardo bajo el nombre de "listado"
					  	List<Producto> listado = (List<Producto>)request.getAttribute("listado");
					  %>
					  <tbody>
					   <!-- ESTO SE REPITE TANTA CANDTIDAD DE VECES COMO ARTICULOS TENGA -->
					   <%
					   	for( Producto  unProducto : listado) {
					   %>
					    <tr>
					      <th scope="row"> <%=unProducto.getIdProducto()%> </th>
					      <td><%=unProducto.getNombre() %></td>
					      <td><%=unProducto.getPrecio() %></td>
					      <td><%=unProducto.getCodigo() %></td>
					      <td>
					      	<a class="btn btn-outline-danger" href="<%=request.getContextPath()%>/api/EliminarController?id=<%=unProducto.getIdProducto()%>" role="button">Eliminar</a> | 
					      	<a class="btn btn-outline-success" href="<%=request.getContextPath()%>/api/EditarController?id=<%=unProducto.getIdProducto()%>" role="button">Editar</a>
					      </td>
					    </tr>
					   <%
					   	}
					   %>
					  </tbody>
					</table>
				</section>
			</div>
		</main>
	</body>	
</html>
