<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.sbs.jsp.board.base.Rq"%>

<!-- 스클립틀릿 문법 -->
<%
    //int dan = 3;
    //int limit = 9;

    //int dan = Integer.parseInt(request.getParameter("dan"));
    //int limit = Integer.parseInt(request.getParameter("limit"));
    int a = 30;

    Rq rq = new Rq(request, response);

    int dan = rq.getIntParam("dan", 9);
    int limit = rq.getIntParam("limit", 9);
%>

<div class="a"></div>

<style>
    .a {
        width: 200px;
        background-color: red;
    }
</style>

<!--<h1>== <%=dan%>단 ==</h1>
<div><%=dan%> * 1 = <%=dan * 1%></div>
<div><%=dan%> * 2 = <%=dan * 2%></div>
<div><%=dan%> * 3 = <%=dan * 3%></div>
<div><%=dan%> * 4 = <%=dan * 4%></div>
<div><%=dan%> * 5 = <%=dan * 5%></div>-->

<% for(int i = 1; i <= limit; i++) { %>
    <div><%=dan%> * <%=i%> = <%=dan * i%></div>
<% } %>
<!-- 방식1 -->
<h1><% out.println(a); %></h1>
<!-- 방식2 -->
<h1><%=a%></h1>
<!-- 방식3 -->
<h1>30</h1>

<%
    System.out.println(a);
%>
