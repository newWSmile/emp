<%--
  Created by IntelliJ IDEA.
  User: 军街
  Date: 2016/9/29
  Time: 20:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>员工管理系统</title>
  </head>
  <body>
    <form action="${pageContext.request.contextPath}/add.do" method="post">
        <table border="2" align="center">
            <tr>
              <th>姓名</th>
              <td><input type="text" name="username"/></td>
            </tr>
            <tr>
              <th>期望薪水</th>
              <td><input type="text" name="salary" value="7000"/></td>
            </tr>
            <tr>
              <th>入职时间</th>
              <td><input type="text" name="hiredata" value="2016-10-7"/></td>
            </tr>
            <tr>
              <td colspan="2" align="center">
                <input type="submit" value="提交"/>
              </td>
            </tr>

        </table>
    </form>
  </body>
</html>
