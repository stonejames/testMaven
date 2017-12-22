<%@ page pageEncoding="UTF-8" contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>展示员工</title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/style.css" />
	</head>
	<body>
		<div id="wrap">
			<div id="top_content"> 
				<div id="header">
					<div id="rightheader">
						<p>
							2009/11/20
							<br />
						</p>
					</div>
					<div id="topheader">
						<h1 id="title">
							<a href="#">main</a> 
						</h1>
					</div>
					<div id="navigation">
					</div>
				</div>
				<div id="content">
					<p id="whereami">
					</p>
					<h1>
						Welcome!
					</h1>
					<form method="post" action="${pageContext.request.contextPath}/emp/deleteSome">
					<table class="table">
						<tr class="table_header">
						    <td>
							   	全选
							</td>
							<td>
								编号
							</td>
							<td>
								姓名
							</td>
							<td>
								薪水
							</td>
							<td>
								年龄
							</td>
							<td>
							    性别
							</td>
							<td>
								操作
							</td>
						</tr>
					   <c:forEach var="emp" items="${emplist}">
							<tr>
								<td>
								   <input type="checkbox" name="ids" value="${emp.id}"/>
								</td>
								<td>
									${emp.id}
								</td>
								<td>
								    ${emp.name}
								</td>
								<td>
								    ${emp.salary}
								</td>
								<td>
									 ${emp.age}
								</td>
								<td>
									 ${emp.sex}
								</td>
								<td>

									<a href="${pageContext.request.contextPath}/emp/delete/${emp.id}">删除员工</a>&nbsp;
									<a href="${pageContext.request.contextPath}/emp/selectOne/${emp.id}">修改员工</a>
								</td>
							</tr>
					   </c:forEach>
					</table>
					  <input type="submit" value="删除勾选项"/>
					</form>
					<p>
						<a href="${pageContext.request.contextPath}/dept/selectAll">添加员工</a>
					</p>
				</div>
			</div>
			<div id="footer">
				<div id="footer_bg">
				ABC@126.com
				</div>
			</div>
		</div>
	</body>
</html>
