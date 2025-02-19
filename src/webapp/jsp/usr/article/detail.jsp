<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page import="com.sbs.jsp.board.boundedContext.article.dto.Article"%>

<h1>게시물 상세보기</h1>

<div>
    <div>ID : ${article.id}</div>
    <div>subject : ${article.subject}</div>
    <div>content : ${article.content}</div>
</div>