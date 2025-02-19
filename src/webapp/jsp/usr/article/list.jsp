<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page import="com.sbs.jsp.board.boundedContext.article.dto.Article"%>

<h1>게시물 리스트</h1>

<section class="article-list">
    <a href="write">게시물 작성</a>
    <nav>
        <ul>
            <c:forEach var="article" items="${articles}">
                <li>
                    <span>${article.id}번 : </span>
                    <a href="detail?id=${article.id}"><span>${article.subject}</span></a>
                </li>
            </c:forEach>
        </ul>
    </nav>
</section>