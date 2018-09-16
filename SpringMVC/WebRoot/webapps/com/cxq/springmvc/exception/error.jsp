<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>Spring MVC's Exception Error!</title>
    
  </head>
  
  <body>
  	<center>
   	 <h1>Exception Error：</h1>
   	 ${exception }
   	 <!-- 
   	 	simpleMappingExceptionResolver中，其值默认为 exception，可以在SpringMVC配置文件中进行配置其value值
   	 	<property name="exceptionAttribute" value="exception"></property>
   	  -->
    <center>
  </body>
</html>
