<%@ taglib prefix="c" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "x" uri = "http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<body>
	 	<div>
		<p>
		<h1>${headerName}</h1>
		</p>
	</div>
		<div>
			<c:form method="POST" action="/beautyparlour/beauty" modelAttribute="mod">
				<table>
        			<tr>
        				<td>parlour_name</td>
        				<td><c:input type="text" path="parlour_name"></c:input></td>
        			</tr>
        			<tr>
        				<td>location</td>
        				<td><c:input type="text" path="location"></c:input> </td>
        			</tr>
        			<tr>
        				<td>fees</td>
        				<td><c:input type="text" path="fees"></c:input> </td>
        			</tr>
        			<tr>
        				<td colspan=2><input type="submit" value="Save"> </td>
        			</tr>
        		</table>
			</c:form>
		</div>
	</body>
</html>