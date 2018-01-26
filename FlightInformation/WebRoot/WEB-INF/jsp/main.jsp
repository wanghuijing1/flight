<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>首页</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/yibu.js"></script>

</head>

<body>

	<h1>航班查询</h1>
	 <input type="hidden" id="path" value="${pageContext.request.contextPath }"/>
	<form method="post" action="${pageContext.request.contextPath }/show.do">
		日期：<input name="time" value=${time }> 城市：从<input
			name="takeoff" value="${takeoff }"> 到<input name="landing"
			value="${landing }"><input value="搜 索" type="submit">
	</form>
	<table>
		<tr style="color:#fff;background-color: blue">
			<td>航空公司/航班机型</td><td>起降时间</td><td>机场</td><td>飞行时长</td><td>经停</td><td>参考报价</td><td>操作</td>
		</tr>
		<c:if test="${flightList==null||flightList.size()==0 }">
		<tr><td colspan="7" align="center"><h2>查无航班</h2></td></tr>
		</c:if>
		 <c:forEach var="flight" items="${flightList }">
		<tr style="color:#000;background-color: yellow">
			<td>${flight.airline }${flight.flightCode }<br/>${flight.type }</td>
			<td><fmt:formatDate value="${flight.takeoffTime }" type="both"   dateStyle="long" timeStyle="long" /><br/>
			<fmt:formatDate value="${flight.landingTime }" type="both"  dateStyle="long" timeStyle="long" /></td>
			<td>${flight.takeoffAirportName }<br/>${flight.landingAirportName }</td>
			<td>${flight.flightTime }</td>
			<td>${flight.stopAirport }</td>
			<td>${flight.referencePrice }</td>
			<td><input type="button" value="查询机票" fid=${flight.id } name="sel"></td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>
