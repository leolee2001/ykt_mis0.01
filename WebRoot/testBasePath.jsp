<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

out.println("basePath:"+basePath);
out.println("<br/>");
out.println("getContextPath:"+request.getContextPath());
out.println("<br/>");
out.println("getServletPath:"+request.getServletPath());
out.println("<br/>");
out.println("getRequestURI:"+request.getRequestURI());
out.println("<br/>");
out.println("getRequestURL:"+request.getRequestURL());
out.println("<br/>");
out.println("getRealPath:"+request.getRealPath("/"));
out.println("<br/>");
out.println("getServletContext().getRealPath:"+getServletContext().getRealPath("/"));
out.println("<br/>");
out.println("getQueryString:"+request.getQueryString());
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>CAU_YKT_Mis</title>
<base href="<%=basePath%>">
</head>
<body>
				<p style="text-align: center; color: red"> JSP中涉及到的路径<p/>
</body>
</html>