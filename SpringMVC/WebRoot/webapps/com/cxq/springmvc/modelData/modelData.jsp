<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>Spring MVC's 模型数据!</title>

  </head>
  
  <body>
  
  	<h1>模型数据</h1>
  		<h2>ModelAndView</h2>
  			time: ${requestScope.time }
  		<h2>Map</h2>
  			names: ${requestScope.names }
  		<h2>SessionAttributes</h2>
  			request user: ${requestScope.user }<br><br>
  			session user: ${sessionScope.user }<br><br><br>
  			request school: ${requestScope.school }<br><br>
  			session school: ${sessionScope.school }
  		<h2>ModelAttribute</h2>
  			abc user: ${requestScope.abc }<br><br>
  </body>
</html>
