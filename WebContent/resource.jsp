<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:directive.page import="org.springframework.web.util.WebUtils" />
<jsp:directive.page
    import="org.springframework.web.context.support.ServletContextResource" />
<jsp:directive.page import="org.springframework.core.io.Resource" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <%
        Resource res3 = new ServletContextResource(application,
                "/WEB-INF/web.xml");
        out.print(res3.getFilename() + "<br/>");
        out.print(WebUtils.getTempDir(application).getAbsolutePath());
    %>



</body>
</html>