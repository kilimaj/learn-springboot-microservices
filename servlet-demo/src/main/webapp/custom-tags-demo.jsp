<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="my-custom-tag-library" prefix="jbk"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Custom Tags Demo</title>
</head>
<body>
	<h1>Custom Tags Demo</h1>
	<hr>
	<jbk:date />
	<jbk:date pattern="d/M/yyyy" />
	<br>
	<jbk:date />
	<jbk:date />
</body>
</html>