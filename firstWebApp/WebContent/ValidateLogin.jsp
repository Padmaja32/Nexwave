
<%@page session="true" import = "com.del.first.entity.Users, com.del.first.dao.UserDAO" %>
<%
	String username = request.getParameter("uid");
	String password = request.getParameter("pwd");
	session.setAttribute("username",username);
	
	Users u = new Users(username,password);
	if(new UserDAO().validateUser(u)) {
%>
		<jsp:forward page="Services.html"/>
<%
	}
	else
	{
%>
		<%="Invalid Username / Password" %>
		<jsp:include page="loginJSP.html"/>
<%
	}
%>