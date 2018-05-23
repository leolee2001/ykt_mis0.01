<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>CAU_YKT_Mis</title>
<base href="<%=basePath%>">
</head>
<body background="img/01.jpg" >
	<!-- <img alt="aaa" src="img/02.jpg"> -->
	<div style="margin-left: 30%;margin-top: 15%;">
		<h1>中国农业大学一卡通信息管理系统</h1>
		<form action="login" method="post" >
			用户名：<input type="text" name="uname" /><br/><br/>
			密&nbsp;&nbsp;&nbsp;码：<input type="password" name="pwd" /><br/><hr/>
			
			<input type="submit" value="登陆" />
		</form>
	</div>
</body>
</html>