<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gate Pass</title>
    </head>
    <body>

         <li><p><b>First Name:</b>
            <%= request.getParameter("firstName")%>
         </p></li>
    </body>
</html>
