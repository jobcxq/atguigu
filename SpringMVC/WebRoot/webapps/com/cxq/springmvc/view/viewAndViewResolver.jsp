<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>Spring MVC's ViewAndViewResolver!</title>
    
  </head>
  
  <body>
   	<p>ViewAndViewResolver SUCCESS!</p>
   	
   	<h1>国际化 JSTL VIEW</h1>
   	<fmt:message key="i18n.username"></fmt:message>
	<br><br>
	
	<fmt:message key="i18n.password"></fmt:message>
	<br><br>
   	
  </body>
</html>
