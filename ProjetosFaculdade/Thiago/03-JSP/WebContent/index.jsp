<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello World - JSP</title>
</head>
<body>

	<h1>Index</h1>

	<%-- Incluir um arquivos JSP --%>
	<%@ include file="topo.jsp"%>

	<%-- Cometário --%>

	<ul>
		<%
			for (int i = 0; i < 10; i++) {
		%>
		<li><%=i%></li>
		<%
			}
			// fechamento do for
		%>
	</ul>

	<%@ include file="rodape.jsp"%>

</body>
</html>