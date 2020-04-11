<%--
  Created by IntelliJ IDEA.
  User: BrownQi
  Date: 2020/4/11
  Time: 17:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>iframe测试页面无刷新</title>

    <script>
        function go() {
            let url = document.getElementById("url").value;
            document.getElementById("iframe1").src = url;
        }
    </script>

</head>
<body>

<div>
    <p>请输入地址：</p>
    <input type="text" id="url" placeholder="请输入要访问的地址" value="http://www.brownqi.cn">
    <input type="button" value="提交" onclick="go()">
</div>

<div>
    <iframe id="iframe1" style="width:100%;height: 500px"></iframe>
</div>

</body>
</html>
