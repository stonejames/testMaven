<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/12/4
  Time: 8:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script>
        /*var a1 = /^zhangsan$/;//正则表达式
        console.log(a1.test("zhangsan"));*/

        /*var a2 = /^[0-9]+$/
        console.log(a2.test("122"));*/

       /* var a3 = /^[\u4e00-\u9fa5]{1,3}$/;
        console.log(a3.test("好的"));*/

       /* var username = "abc呵呵123";
        username = username.replace(/[\u4e00-\u9fa5]/g,'a');
        console.log(username)*/

        var username = "abc呵呵123";
        var len = 0;
        for(var i=0;i<username.length;i++){
            if(username.charCodeAt(i) > 127){
                len = len +2;
            }else{
                len += 1;
            }
        }
        console.log(len)
    </script>
</head>
<body>
aaaa
</body>
</html>
