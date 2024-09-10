<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello JSP!</title>
</head>
<body>
	<h1>Hello JSP!</h1>
	<hr>
	<p>Developed by John Kilima</p>

	<form action="">
		<input type="text" name="myinputs">
		<button>Submit</button>
	</form>

	<%
	String name = request.getParameter("myinputs");
	if (name != null) {
		out.println("<h3> Hello, " + name + "!<h3>");
	}
	%>
</body>
</html>