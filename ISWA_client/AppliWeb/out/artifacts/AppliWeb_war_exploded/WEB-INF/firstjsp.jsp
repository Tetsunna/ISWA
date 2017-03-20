<%--
  Created by IntelliJ IDEA.
  User: orion
  Date: 17/03/2017
  Time: 14:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP DU FIRST SERVLET</title>
</head>
<body>
<p>FIRST JSP BIATCHZZZZZZZZZZZZZZZ</p>
<p>
    <%
        String mess = (String)request.getAttribute("mess_firstjsp");
        out.println(mess);
        String param = request.getParameter("user");
        out.println(param);
    %>
</p>
<p> FIRST BEAN BITCHZZZZ</p>
<p>
    <%
        myBeanPack.Coyote myBean = (myBeanPack.Coyote)request.getAttribute("Coyote");
        out.println(myBean.getNom());
        out.println(myBean.getPrenom());
    %>
</p>
    </body>
</html>
