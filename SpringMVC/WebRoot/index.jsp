<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>Spring MVC</title>
	<script type="text/javascript" src="scripts/jquery-1.7.2.js"></script>
	<script type="text/javascript">
		$(function(){
			$("#json").click(function(){
				var url = this.href;
				var args = {};
				$.post(url, args, function(data){
					for(var i = 0; i < data.length; i++){
						var id = data[i].id;
						var lastName = data[i].lastName;
						
						alert(id + ": " + lastName);
					}
				});
				return false;
			});
		})
	</script>
  </head>
  
  <body>
  <div style="float:left; width:30%; margin-left:5%">
    <h1>1.Hello Wrold</h1>
    	<p><a href="helloworld/sayHello.do">Hello World</a></p>
    	
    <h1>2.RequestMapping</h1>
    	<h2>Method</h2>
	    	<form action="requestMapping/method.do" method="post">
	    		<input type="submit" value="requestMapping's post method"/>
	    	</form>
    	
    	<h2>ParamsAndHeaders</h2>
    		<a href="requestMapping/paramsAndHeaders.do?username=cxq&age=10">requestMapping's ParamsAndHeaders</a>
    	
    	<h2>PathVariable</h2>
    		<a href="requestMapping/pathVariable/100.do">requestMapping's pathVariable</a>
    	
    	<h2>REST</h2>
    		<h3>PUT</h3>
	    	<form action="rest/put/1.do" method="post">
				<input type="hidden" name="_method" value="PUT"/>
				<input type="submit" value="TestRest PUT"/>
			</form>
			
			<h3>DELETE</h3>
			<form action="rest/delete/1.do" method="post">
				<input type="hidden" name="_method" value="DELETE"/>
				<input type="submit" value="TestRest DELETE"/>
			</form>
			
			<h3>POST</h3>
			<form action="rest/post.do" method="post">
				<input type="submit" value="TestRest POST"/>
			</form>
			
			<h3>GET</h3>
			<a href="rest/get/1.do">Test Rest Get</a>
    	
    <h1>3.响应请求参数、请求头</h1>
    	<h2>RequestParam</h2>
    	<a href="requestParam/requestParam.do?username=chenxiaoqin&age=11">Test RequestParam</a> 
    	
    	<h2>POJO</h2>
    	<form action="pojo.do" method="post">
			username: <input type="text" name="username"/>
			<br>
			password: <input type="password" name="password"/>
			<br>
			email: <input type="text" name="email"/>
			<br>
			age: <input type="text" name="age"/>
			<br>
			city: <input type="text" name="address.city"/>
			<br>
			province: <input type="text" name="address.province"/>
			<br>
			<input type="submit" value="POJO"/>
		</form>
		
		<h2>ServletAPI</h2>
		<a href="servletAPI.do">Test ServletAPI</a>
  </div>
  <div style="float:right; width:30%; margin-right: 5%">
  	<h1>8.国际化</h1>
		<!--  
		关于国际化:
		1. 在页面上能够根据浏览器语言设置的情况对文本(不是内容), 时间, 数值进行本地化处理
		2. 可以在 bean 中获取国际化资源文件 Locale 对应的消息
		3. 可以通过超链接切换 Locale, 而不再依赖于浏览器的语言设置情况
		
		解决:
		1. 使用 JSTL 的 fmt 标签
		2. 在 bean 中注入 ResourceBundleMessageSource 的示例, 使用其对应的 getMessage 方法即可
		3. 配置 LocalResolver 和 LocaleChangeInterceptor
		-->	
		<a href="i18n.do">I18N PAGE</a>
	<h1>9.FileUpload</h1>
		<form action="fileUpload.do" method="POST" enctype="multipart/form-data">
			File: <input type="file" name="file"/><br/>
			Desc: <input type="text" name="desc"/><br/>
			<input type="submit" value="Submit"/>
		</form>
	<h1>10.拦截器</h1>
		测试：<a href="employeeList.do">All Employees</a>
	<h1>11.Exception</h1>
		<h2>ExceptionHandlerExceptionResolver</h2>
			<a href="exceptionHandlerExceptionResolver.do?i=10">Test ExceptionHandlerExceptionResolver</a>
		<h2>ResponseStatusExceptionResolver</h2>
			<a href="responseStatusExceptionResolver.do?i=10">Test ResponseStatusExceptionResolver</a>
		<h2>DefaultHandlerExceptionResolver</h2>
			<a href="defaultHandlerExceptionResolver.do">Test DefaultHandlerExceptionResolver</a>
		<h2>SimpleMappingExceptionResolver</h2>
			<a href="simpleMappingExceptionResolver.do?i=2">Test SimpleMappingExceptionResolver</a>
  	<h1>12.整合Spring</h1>
  		<a href="andSpring.do">Test Spring And SpringMVC</a>
  </div>
  
  <div style="margin-left:30%; width:30%">
  	<h1>4.模型数据</h1>
  		<h2>ModelAndView</h2>
  			<a href="modelAndView.do">Test ModelAndView</a>
  		<h2>Map</h2>
  			<a href="map.do">Test Map</a>
  		<h2>SessionAttributes</h2>
  			<a href="sessionAttributes.do">Test SessionAttributes</a>
  		<h2>ModelAttribute</h2>
	  		<!--  
				模拟修改操作
				1. 原始数据为: 1, Tom, 123456,tom@qq.com,12
				2. 密码不能被修改.
				3. 表单回显, 模拟操作直接在表单填写对应的属性值
			-->
			<form action="modelAttribute.do" method="Post">
				<input type="hidden" name="id" value="1"/>
				username: <input type="text" name="username" value="Tom"/>
				<br>
				email: <input type="text" name="email" value="tom@qq.com"/>
				<br>
				age: <input type="text" name="age" value="13"/>
				<br>
				<input type="submit" value="Submit"/>
			</form>
	<h1>5.ViewAndViewResolver</h1>
		<h2>ViewAndViewResolver</h2>
			<a href="viewAndViewResolver.do">test ViewAndViewResolver</a>
		<h2>View</h2>
			<a href="view.do">Test View</a>
		<h2>Redirect</h2>
			<a href="redirect.do">Test Redirect</a>
	<h1>6.CRUD</h1>
		<a href="employeeList.do">All Employees</a>
	<h1>7.JSON</h1>
		<h2>Json</h2>
			<a href="json.do" id="json">Test Json</a>
		<h2>HttpMessageConverter</h2>
			<form action="httpMessageConverter.do" method="POST" enctype="multipart/form-data">
				File: <input type="file" name="file"/><br/>
				Desc: <input type="text" name="desc"/><br/>
				<input type="submit" value="Submit"/>
			</form>
		<h2>ResponseEntity</h2>
			<a href="responseEntity.do">Test ResponseEntity</a>
  </div>
  </body>
</html>
