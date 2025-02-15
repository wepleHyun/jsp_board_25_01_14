package com.sbs.jsp.board.servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

@WebServlet("/home")
public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8"); //들어오는 데이터를 UTF-8로 해석
        resp.setCharacterEncoding("UTF-8"); //완성되는 HTML을 UTF-8로 인코딩
        resp.setContentType("text/html; charset=utf-8"); //브라우저에게 우리가 만들 결과물이 UTF-8이라고 알리는 의미

        resp.getWriter().append("Hello!!");
        resp.getWriter().append("안녕!!");
    }
}
