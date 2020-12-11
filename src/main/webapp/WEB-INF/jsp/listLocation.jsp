<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
<!DOCTYPE HTML>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Person List</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css"/>
  </head>
  <body>
    <h1>Locations List</h1>
    
    <br/><br/>
    <div>
      <table border="1">
        <c:forEach  items="${locations}" var ="location">
        <tr>
          <td>${location.city}</td>
          <td>${location.id}</td>
        </tr>
        </c:forEach>
      </table>
    </div>
  </body>
  
</html>