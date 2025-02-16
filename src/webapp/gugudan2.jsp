<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!-- 스클립틀릿 문법 -->
<%
    int dan = (int)request.getAttribute("dan");
    int limit = (int)request.getAttribute("limit");
    int a = (int)request.getAttribute("a");
%>

<!-- 스클립틀릿 문법 으로는 가독성이 떨어지므로 잘 사용 하지 않는다  -->
<!--
<h1><%=dan%></h1>

<% for(int i = 1; i <= limit; i++) { %>
    <div><%=dan%> * <%=i%> = <%=dan * i%></div>
<% } %>
-->

<!-- EL 문법 -->
<h1>${a}단</h1>
<div>${dan} * ${limit} = ${dan * limit}</div>

