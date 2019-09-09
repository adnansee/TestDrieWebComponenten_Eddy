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
<h1>${responce}</h1>
<form method="get">
<h1>Welcome ${message}</h1>
    <button onclick ="goBack()">Log out</button>
    <script>
        function goBack() {
            window.history.back();
        }
    </script>
    </button>

</form>
</body>
</html>
