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
               date : {"uname" : $("#uName1").val(), "upwd" : $("#uPwd1").val()},
               success: function(date) {
//                alert(date)
                   alert(date.uname)
                   alert(date.upwd)
            }
           });
        }
    </script>
    <script src="./j/jquery.js"></script>
    <script src="./aa.js"></script>

</head>
<body>
<form action="login" method="get" enctype="multipart/form-data">
    <input type="text" id="uName" name="uname"><br>
    <input type="text" id="uPwd" name="upwd"><br>
   <%-- <input type="button" value="登陆" onclick="aaa();">--%>
    <input type="submit" value="登陆">
</form>
<input type="text" id="uName1" name="uname"><br>
<input type="text" id="uPwd1" name="upwd"><br>
 <input type="button" value="登陆" onclick="aaa();">
</body>
</html>