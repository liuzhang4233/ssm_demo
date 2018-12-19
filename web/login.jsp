<%--
  Created by IntelliJ IDEA.
  User: Zero
  Date: 2018/12/18
  Time: 22:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
    <script type="text/javascript">
        /*function over() {
           var name =  document.getElementById("uName").value;
            var pwd =  document.getElementById("uPwd").value;
            document.getElementsByTagName("form")[0].action = "login?uName="+name+"&uPwd="+pwd;
            document.getElementsByTagName("form")[0].submit();
        }*/
    </script>
</head>
<body>
<form action="login" method="post" enctype="multipart/form-data">
    <input type="text" id="uName" name="uName"><br>
    <input type="text" id="uPwd" name="uPwd"><br>
    <%--<input type="button" value="登陆" onclick="over()"><br>--%>
    <input type="submit" value="登陆">
</form>
</body>
</html>