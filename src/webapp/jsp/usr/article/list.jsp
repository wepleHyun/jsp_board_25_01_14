<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page import="com.sbs.jsp.board.boundedContext.article.dto.Article"%>

<h1>게시물 리스트</h1>

<div>
    <c:forEach var="article" items="${articles}">
        <li>
            <span>${article.id}번 : </span>
            <span>${article.subject}</span>
        </li>
    </c:forEach>


</div>