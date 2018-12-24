<%--
  Created by IntelliJ IDEA.
  User: Zero
  Date: 2018/12/18
  Time: 22:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript">
        function aaa() {
            var url = "/login";
           $.ajax({
              url : url,
               contentType: "application/json",
               type : "post",
               date : {"uname" : $("#uName").val(), "upwd" : $("#uPwd").val()},
               success: function(date) {
                alert(date)
            }
           });
        }
    </script>
    <script src="./jquery-1.7.2.min.js"></script>
    <script src="./aa.js"></script>

</head>
<body>
<form action="login" method="get" enctype="multipart/form-data">
    <input type="text" id="uName" name="uname"><br>
    <input type="text" id="uPwd" name="upwd"><br>
   <%-- <input type="button" value="登陆" onclick="aaa();">--%>
    <input type="submit" value="登陆">
</form>
</body>
</html>