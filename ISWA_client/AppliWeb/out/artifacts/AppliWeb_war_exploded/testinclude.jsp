<%--
  Created by IntelliJ IDEA.
  User: orion
  Date: 20/03/2017
  Time: 11:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>testinclude</title>
</head>
<body>
<%
    ArrayList<Integer> liste = new ArrayList<Integer>();
    liste.add( 12 );
    out.println( liste.get( 0 ) );
%>
</body>
</html>
