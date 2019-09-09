<%--
  Created by IntelliJ IDEA.
  User: SYEDS
  Date: 09/09/2019
  Time: 09:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome Page</title>
</head>
<body>
<form method="get">
<p>WELCOME ${message}</p>
    <button onclick ="goBack()">Go Back</button>
    <script>
        function goBack() {
            window.history.back();
        }
    </script>
    </button>

</form>
</body>
</html>
